import java.util.Random;

public class Brother {
	// 램덤한 정수 입력 (1~3)
	Random brain = new Random();
	
	int hand;
	
	public int fire() {
		return brain.nextInt(3) + 1;
	}
}
