package chap07.textbook.s070803;

public class PhoneExample {
	public static void main(String[] args) {
//		 Phone phone = new Phone(); // 부모클래스로는 인스턴스 생성 불가
		 
		 SmartPhone smartPhone = new SmartPhone("홍길동");
		 
		 smartPhone.turnOn();
		 smartPhone.interSearch();
		 smartPhone.turnOff();
	}
}
