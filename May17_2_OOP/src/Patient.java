import java.util.Scanner;

public class Patient {
	String PatName;
	int PatAge;
	Scanner mouth = new Scanner(System.in);
	double height;
	double weight;
	double bmi;
	String bmiResult;
	
	public void ShowPatientInfo() {
		System.out.println("<< 환자 >>");
		System.out.println(this.PatName);
		System.out.println(PatAge);
		System.out.println("=============");
	}
	
	// 키에 대해 대답
	public double answerHeight() {
		return mouth.nextDouble();
	}
	
	// 몸무게에 대해 대답
	public double answerWeight() {
		return mouth.nextDouble();
	}
	
	
	
	
}
