import java.util.Scanner;

// 지역변수 (Local Variable)
//		메소드 속에서 만든 변수
//		그 행동을 하는 동안에만 필요한 임시변수로...
// 메소드 파라미터 (Parameter)
// 		그 행동을 하는데 필요한 재료
// 리턴되는 값
// 		그 행동을 한 후에 결과물
// 멤버변수 (Member Variable)
// 		그 객체의 속성


public class Doctor {
	String DocName;
	int DocAge;
	double height;
	double weight;
	
	public void ShowDocInfo() {
		System.out.println("<< 의사 >>");
		System.out.println(this.DocName);
		System.out.println(DocAge);
		System.out.println("=============");
	}
	
	// 손님 부르기
	// 재료 : 불러올 대상
	public void CallPatient(Patient p) {
		System.out.printf("의사 : 다음 환자분 %s씨 들어오세요.\n", p.PatName);
	}
	
	public double AskHeight(Patient p) {
		System.out.println("의사 : 키를 알려주세요");
		System.out.println("키(cm) : ");
		double height = p.answerHeight();
		if(height > 1 && height <= 300) {
			System.out.println("======");
			System.out.println("나보다 좀 작네 ㅋ");
			System.out.println("======");
		} else if (height < 1 || height > 300) {
			System.out.println("======");
			System.out.println("어허 노 장난");
			System.out.println("======");
		}
		return (height >=1 && height <= 300) ? height/100: AskHeight(p);
	}
	
	public double AskWeight(Patient p) {
		System.out.println("의사 : 체중을 알려주세요");
		System.out.println("몸무게(kg) : ");
		double weight = p.answerWeight();
		if (weight >= 1) {
			System.out.println("======");
			System.out.println("...ㅋ");
			System.out.println("======");
		} else if (weight < 1) {
			System.out.println("======");
			System.out.println("진심 사람이세요?");
			System.out.println("======");
		}
		return (weight >= 1) ? weight : AskWeight(p);
	}
	
	// BMI(체질량지수) :
	//		몸무게 / (키 * 키) => 키 : m단위
	//		18.5 미만이면 저체중
	//		18.5 이상이면 정상
	//		25 이상이면 과체중
	//		30 이상이면 경도비만
	//		35 이상이면 중증도비만
	//		40 이상이면 고도비만
	
	public double CalcBMI(Patient p) {
		return p.weight / (p.height * p.height);
	}
	
	public String JudgeBmi(Patient p) {
		if (p.bmi >= 40) {
			return "고도비만";
		} else if (p.bmi >= 35) {
			return "중증도비만";
		} else if (p.bmi >= 30) {
			return "경도비만";
		} else if (p.bmi >= 25) {
			return "과체중";
		} else if (p.bmi >= 18.5) {
			return "정상";
		} else {
			return "저체중";
		}
	}
	
	public void tellResult(Patient p) {
		System.out.printf("%s씨의 키는 %.1fcm이고, 몸무게는 %.1fkg...\n",
				p.PatName, p.height, p.weight);
		System.out.printf("체질량지수(BMI) : %.1f\n", p.bmi);
		System.out.printf("당신은...%s이니까....NAGA!", p.bmiResult);
		
	}
	
	
	public void start(Patient p) {
		CallPatient(p);
		p.height = AskHeight(p);
		p.weight = AskWeight(p);
		p.bmi = CalcBMI(p);
		p.bmiResult = JudgeBmi(p);
		tellResult(p);
		
	}
	
	
}
