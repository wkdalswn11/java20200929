package chap14.lecture.parameter;

public class ParameterEx2 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) -> System.out.println(a + b);
		o1.method(3, 10);
		
		MyInterface2 o2 = (x, y) -> System.out.println(x / y);
		o2.method(15, 5);
		
//		MyInterface2 o3 = x, y -> System.out.println(x + y); // 매개변수가 두개이상일때는 () 생략불가
	}
}
