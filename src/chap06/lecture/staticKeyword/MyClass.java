package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2; 
	int var1;
	
	static {
		System.out.println("static block");
		var2 = 3000;
		
	}
	
	void method1() {
		System.out.println(var1);
		System.out.println(var2); // 스태틱(클래스) 맴버에서 인서턴스멤버에 접근은 가능함
	}
	static void method2() {
//		System.out.println(var1); // 인스턴스 멤버는 스태틱(클래스) 멤버에 접근 불가능함 
		System.out.println(var2);
	}
}
