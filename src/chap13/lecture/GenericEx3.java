package chap13.lecture;

public class GenericEx3 {
	public static void main(String[] args) {
		GenericEx3.<String> method("java");
		method("hello"); // <> 안을 유추가능할때는 생략가능
		method(3);
		String s = method2(); // 이렇게 쓰면 string 타입으로 유추가능
		Integer i = method2(); // 이렇게 쓰면 Integer 타입으로 유추가능
		
	}
	
	public static <T> T method2() {
		return null;
	}
	
	public static <T> void method(T t) { //리턴타입 앞에 쓰면 호출될때 적용
		System.out.println(t);
	}
}
