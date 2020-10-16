package chap07.lecture.override;

public class ChildClass extends ParentClass {
	void method2(){
		System.out.println("child method");
	}
	
	@Override // @ 어노테이션은 코드에 영향을주거나 설명,힌트를 주는 주석이다.
	void method1() {
		System.out.println("child method1!!!!!!!!!!!!");
	}
}
