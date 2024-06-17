// 3. 대화상자
//	alert, prompt, confirm

// alert : 알려줌 (일방적인 경고창)
alert('경고!');

// prompt : 값을 입력받을 수 있음
let name = prompt("이름을 입력하세요.");
alert(`안녕하세요, ${name}님. 곧 퇴근입니다 ^_^`);
//	prompt에 값 넣지 않고 취소하면 어떤 값이... => null (아무 내용도 없다)

// 	prompt값에는 default값도 넣을 수 있음
//		뭔가에 대한 값을 넣을 때, 안내를 하거나 힌트를 주는 역할도 가능함 !
//		2개의 파라미터를 가질 수 있음 (보여줄 메세지, 입력받을 default값)
let reservation = prompt("예약일을 입력해주세요.", "2024-06-");

// confirm : 확인 받음
//	값 : 확인 => true / 취소 => flase
let isAdult = confirm("당신은 성인입니까 ?");
alert(isAdult);

// 정리!
	alert("무 야 호 ~");		// 메세지를 보여주는 기능
	prompt("점심메뉴 ?");		// 메세지를 보여주고, 어떤 값을 입력받게 해주는 기능
	confirm("JS 재밌나요 ?");	// 사용자에게 확안받기 위한 기능

// 단점
//	1. 창이 떠있는 동안은 스크립트가 일시적으로 정지
// 	2. 스타일링 불가능 ! (위치, 모양을 정해줄 수 없음)
//	3. 브라우저마다 모양이 제각각 다르다...

// 	그럼에도 불구하고
//	=> 빠르고 간단하게 적용가능한 장점이 있어서 광범위하게 많이 사용하고 있음 !



















