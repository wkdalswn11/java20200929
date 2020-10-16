package chap07.textbook.exercise.p08;

public class A {
	public static void main(String[] args) {
		B b =(B) new A();
	}

}

// 1번문제 : 1
// 2번문제 : 2 (항상이 아니고 instanceof 로 확인해야함 )
// 3번문제 : 1
// 4번문제 : 4 ( 다른 패키지라도 자식 클래스에서는 접근가능 )
