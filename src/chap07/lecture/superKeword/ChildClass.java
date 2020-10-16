package chap07.lecture.superKeword;

public class ChildClass extends ParentClass {
	@Override
	void method1() {
		super.method1(); //상위 클래스에 method1(); 가 실행되고 후 아래있는것이 실행됨
		
		System.out.println("child method1");
	}
	
	
}
