package chap07.textbook.s070803;

public class SmartPhone extends Phone{
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	//메소드
	public void interSearch() {
		System.out.println("인터넷을 검색 합니다.");
	}
}
