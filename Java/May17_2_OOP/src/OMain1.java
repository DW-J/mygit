// Coder : 개발자
// Programmer : Coder + 설계 ***

// OOd (Object Oriented Design) - 객체 지향 디자인
//	실생활을 디자인
public class OMain1 {
	public static void main(String[] args) {
		// 의사 (이름, 나이)
		Doctor d = new Doctor();
		d.DocName = "김박사";
		d.DocAge = 55;
		d.ShowDocInfo();
		// 손님 (이름, 나이)
		Patient p = new Patient();
		p.PatName = "정다운";
		p.PatAge = 30;
		p.ShowPatientInfo();
		
				
		//~님 들어오세요
		//환자 입장
		//의사 =>환자의 키 몸무게 물어봄
		// 환자 =>대답
		// 의사 bmi수치 계산후 결과
		d.start(p);
		
		
	}
}
