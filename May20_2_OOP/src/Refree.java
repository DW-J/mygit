
public class Refree {
	
	// 나를 호출
	public User callUser() {
		System.out.println("심판 : 도전자는 앞으로 나와주시죠.");
		System.out.println("User : 이 몸 등! 장! ㄴㅇㄱ");
		return new User();
	}
	
	// 친구의 답 요구 (종이로)
	public int askFriendAnswer(Friend f) {
		int friAns = f.writeNumber();
		return friAns;
	}
	
	// 나의 답 요구 (말로)
	public int askUserAnswer(User u) {
		System.out.println("도전자는 숫자를 제시하십시오 : ");
		int userAns = u.tellMyAns();
		if (userAns < 1 || userAns > 100) {
			System.out.println("숫자를 다시 입력하세요.");
		}
		return (userAns >= 1 && userAns <= 100) ? userAns : askUserAnswer(u);
	}
	
	// 판정 (맞출때까지 진행)
	public boolean checkBothNumber(int answer, int userAns) {
			if (answer > userAns) {
				System.out.println("UP!");
			} else if (answer < userAns) {
				System.out.println("DOWN!");
			} else {
				System.out.println("정답!");
				System.out.println("%d번만에 맞추셨습니다.");
			}
			return (answer == userAns);
	}
	
	// 시도 횟수
	public void countTry(int turn) {
		System.out.println("=====================");
		System.out.printf("%d번째 시도만에 정답!\n", turn);
		System.out.println("=====================");
	}
	
	// 함수 모으기 
	public void start(Friend f) {
		User u = callUser();
		int answer = askFriendAnswer(f);
		int userAns = 0;
		boolean endGame = false;
		int turn = 0;
		while (true) {
			userAns = askUserAnswer(u);
			turn++;
			endGame = checkBothNumber(answer, userAns);
			if (endGame) {
				countTry(turn);
				break;
			}
		}
	}
	
	
}
