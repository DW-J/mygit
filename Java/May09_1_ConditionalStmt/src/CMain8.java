import java.util.Scanner;

// BMI 검사 프로그램 (함수.ver)

// 이름, 키(cm), 몸무게(kg) 입력
// BMI(체질량지수) : 몸무게 / (키 * 키) => : m단위

public class CMain8 {
	// BMI 검사 프로그램 시작
	public static void startPro() {
		System.out.println("BMI 검사 프로그램 시작");
	}
	
	// 이름, 키(cm), 몸무게(kg) 입력
	public static String getIntro() {
//		Scanner k = new Scanner(System.in);
//		String name = k.next();
//		return name;
		System.out.println("이름 : ");
		return new Scanner(System.in).next();
	}
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("키(cm) : ");
		double height = k.nextDouble();
		return height / 100; // m단위로 바꿀꺼니까 미리 계산해둔다
//		return new Scanner(System.in).nextDouble();
	}
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("몸무게 : ");
		double weight = k.nextDouble();
		return weight;
//		return new Scanner(System.in).nextDouble();
	}
	
	// BMI(체질량지수) : 몸무게 / (키 * 키) => : m단위
	public static double calcBmi(double height, double weight) {
		double bmi = weight / (height * height);
		System.out.printf("BMI : %.1f\n", bmi);
		
//		if (bmi < 18.5) {
//			System.out.printf("%.1f : 저체중입니다. 좀 먹으세요\n", bmi);
//		} else if (bmi >= 40){
//			System.out.printf("%.1f : 고도비만입니다. 살고싶다고 말해!!!\n", bmi);
//		} else if (bmi >= 35){
//			System.out.printf("%.1f : 중증도비만입니다. 운동 좀 해!\n", bmi);
//		} else if (bmi >= 30){
//			System.out.printf("%.1f : 경도비만입니다. 본인이 봐도 좀 쪘죠?\n", bmi);
//		} else if (bmi >= 25){
//			System.out.printf("%.1f : 과체중입니다. 최근에 좀 많이 드셨나봐요?\n", bmi);
//		} else if (bmi >= 18.5){
//			System.out.printf("%.1f : 정상입니다. 이대로만 가세요\n", bmi);
//		}
		return bmi;
	}
	
	public static String judgeBmi(double bmi) {
		if (bmi >= 40){
			return "고도비만입니다. 살고싶다고 말해!!!";
		} else if (bmi >= 35){
			return "중증도비만입니다. 운동 좀 해!";
		} else if (bmi >= 30){
			return "경도비만입니다. 본인이 봐도 좀 쪘죠?";
		} else if (bmi >= 25){
			return "과체중입니다. 최근에 좀 많이 드셨나봐요?";
		} else if (bmi >= 18.5){
			return "정상입니다. 이대로만 가세요";
		} else {
			return "저체중입니다. 좀 먹으세요";
		}
		
//		String result = "저체중입니다.";
//			if (bmi >= 40){
//				result = "고도비만입니다. 살고싶다고 말해!!!";
//			} else if (bmi >= 35){
//				result = "중증도비만입니다. 운동 좀 해!";
//			} else if (bmi >= 30){
//				result = "경도비만입니다. 본인이 봐도 좀 쪘죠?";
//			} else if (bmi >= 25){
//				result = "과체중입니다. 최근에 좀 많이 드셨나봐요?";
//			} else if (bmi >= 18.5){
//				result = "정상입니다. 이대로만 가세요";
//			}
//			return result;
	}
// 18.5미만이면 저체중
// 18.5이상이면 정상
// 25이상이면 과체중
// 30이상이면 경도비만
// 35이상이면 중증도비만
// 40이상이면 고도비만
// 결과를 출력 (각 결과에 따른 코멘트 작성)하고,
// Y를 입력하면 프로그램이 종료
	
	public static String turnOff() throws InterruptedException {
		Scanner k = new Scanner(System.in);
		
		System.out.print("끄고 싶으면 Y를 입력하세요 : ");
		
		String turnoff = k.next();
		
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(500);
		System.out.println("프로그램을 종료합니다\\(^_^/)");		
		Thread.sleep(500);
		return turnoff;
	}
	
	public static void printResult(String n, double h, double w, 
			double b, String r) {
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.printf("%s님의 키는 %.1fcm, 몸무게는 %.1fkg이고..\n",n ,h*100 ,w);
		System.out.printf("체질량지수(BMI) : %.1f입니다.\n", b);
		
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println("잠시 후 결과가 나옵니다.");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.printf("\t%s님은 %s입니다 !\n", n, r);
		switch (r) {
		case "저체중":
			System.out.println("\t하루에 5끼 챙겨드세요");
			break;
		case "정상":
			System.out.println("\t드시던대로 드시면됩니다");
			break;
		case "과체중":
			System.out.println("\t먹는 양을 줄이시는게?");
			break;
		case "경도비만":
			System.out.println("\t하루에 5끼 챙겨드세요");
			break;
		case "중증도비만":
			System.out.println("\t하루에 1끼만 챙겨드세요");
			break;
		case "고도도비만":
			System.out.println("\t며칠 안먹는 다고 안죽어요");
			break;

		default:
			break;
		}
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	}
	
	public static void exit() {
		Scanner k = new Scanner(System.in);
		System.out.println("종료하시겠습니까(Y/N) ? : ");
		String answer = k.next();
		if (answer.equals("Y") || answer.equals("y")) {
			System.out.println("프로그램을 종료합니다");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		} else {
			System.out.println("프로그램을 종료해야합니다만 ?");
			exit();
		}
	}
	
	public static void start() {
		startPro();
		String name = getIntro();
		double height = getHeight();
		double weight = getWeight();
		double bmi = calcBmi(height, weight);
		String result = judgeBmi(bmi);
		printResult(name, height, weight, bmi, name);
		exit();
	}
	
	public static void main(String[] args) throws InterruptedException  {
		start();
		
	}
}
