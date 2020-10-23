package chap06.textbook.s061504;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation (value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
// 15번 > 18번 > 13번,12번 > 14,16번