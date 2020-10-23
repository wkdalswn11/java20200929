package chap11.textbook1.s110301;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {				// 매개값이 Member타입인지 확인
			Member member = (Member) obj;		// Member타입으로 강제 타입변환후 id필드값이 동일한지 검사후,
			if(id.equals(member.id)) {			// 동일하다면 true값을 리턴
				return true;
			}
		}
		return false;							// 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우
	}											// flase를 리턴
}	
