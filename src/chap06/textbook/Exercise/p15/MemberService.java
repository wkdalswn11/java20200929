package chap06.textbook.Exercise.p15;

public class MemberService {

	boolean login(String id, String password) {
		// if(id.equals("hong") && passwore.equals("12345)) 아래와 같음
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
		
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
