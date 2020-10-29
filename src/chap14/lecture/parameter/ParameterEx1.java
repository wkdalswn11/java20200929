package chap14.lecture.parameter;

public class ParameterEx1 {
	public static void main(String[] args) {
		MyInterface1 o1 = (int a) -> System.out.println(a);
		o1.method(369);
		
		MyInterface1 o2 = (i) -> System.out.println(i);
		o2.method(123);
		
		MyInterface1 o3 = x -> System.out.println(x); //메개 변수가 하나면 ()도 생략가능
		o3.method(456);
	}

	public static void method1(int x) {
		System.out.println(x);
	}
}
