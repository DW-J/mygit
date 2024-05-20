import java.util.Scanner;

public class User {
	
	Scanner mouth = new Scanner(System.in);
	
	public int tellMyAns() {
		System.out.print("정답은 : ");
		int userAns = mouth.nextInt(); 
		return userAns;
	}
}
