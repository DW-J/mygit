import java.util.Scanner;

// 평일 스케쥴 출력해주는 프로그램

// 시간을 입력받아서 (24시간단위) => 해당시간에 속하는 내용을 출력
//		=> (입력한 시간이) 시간 범위가 아니면 다시 입력

// 09시 ~ 18시 : 학원에서 공부
// 09시, 14시, 18시 : QR찍기
// 13시 ~ 14시 : 점심시간 
// 18시 넘어서 ~ 20시 : 집에 가는 시간 
// 20시 ~ 06시 전까지 : 여가시간 + 취침 
// 06시 ~ 09시 전까지 : 기상 + 씻기 + 학원가기

public class YMain1 {
	public static void getSart() {
		System.out.println("=========================");
		System.out.println("스케쥴 출력 프로그램");
		System.out.println("=========================");
	}
	
	public static int getTime() {
		Scanner k = new Scanner(System.in);
		System.out.println("시간 입력(00 ~ 23) : ");
		int time = k.nextInt();
		if (!(time >= 0 && time <= 23)) {
			System.err.printf("%02d시는없습니다. 다시 입력하세요.\n", time);
		}
		return time;
	}
	
//	public static void searchTime(int time) {
//		if (time >= 0 ){
//			System.out.println("여가시간 + 취침");
//		} else if (time <= 6 ){
//			System.out.println("여가시간 + 취침");
//		} else if (time > 6 ){
//			System.out.println("기상 + 씻기 + 학원가기");
//		} else if (time < 9 ){
//			System.out.println("기상 + 씻기 + 학원가기");
//		} else if (time == 9 ){
//			System.out.println("QR찍기");
//		} else if (time > 9 ){
//			System.out.println("학원에서 공부");
//		} else if (time == 14){
//			System.out.println("QR찍기");
//		} else if (time > 14 ){
//			System.out.println("학원에서 공부");
//		} else if (time < 18){
//			System.out.println("학원에서 공부");
//		} else if (time == 18){
//			System.out.println("QR찍기");
//		} else if (time > 18){
//			System.out.println("집에가는시간");
//		} else if (time <= 20){
//			System.out.println("집에가는시간");
//		} else if (time > 20){
//			System.out.println("여가시간 + 취침");
//		} else if (time <= 24 ) {
//			System.out.println("여가시간 + 취침");
//		} else {
//			System.out.println("잘못 입력된 시간입니다.");
//		}
//	}
	
	// 시간을 출력하는 함수
	public static void printTime(int t) {
		System.out.println("-----------------");
		System.err.printf("%02d시 ! \n", t);
		System.out.println("-----------------");
	}
	
	// 결과를 출력하는 함수
	public static void printResult(int time) {
		if (time >= 9 && time <= 18) {
			System.out.println("학원에서 공부를 합니다.");
			if (time == 9 || time == 14 || time == 18) {
				System.out.println("QR!!!!!!!!!!!!!");
			} else if (time >= 13 && time < 14) {
				System.out.println("점심 밥~");
			}
		} else if(time >18 && time <= 20){
			System.out.println("침대가 기다려요 !!!");
		} else if (time >= 6 && time <9){
			System.out.println("일어나기 + 씻기 + 학원가기...;;;;");
		} else {
			System.out.println("여가시간 + 취침");
		}
	}
	
	public static void main(String[] args) {
		int time = getTime();
		printTime(time);
		printResult(time);
	}
}
