package chap07.lecture.abstractKeyword;

public class Cat extends KindaCat { //부모 클래스에서 cry 메소드를 abstract 해서
	public void cry() {				// 강제로 자식클래스에서는 cry를 정의해야함
		System.out.println("고양이가 냐옹 하고 웁니다.");
	}
}
