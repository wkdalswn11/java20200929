package chap14.lecture.nested;

public class NestedEx1 {
	public static void main(String[] args) {
		final int i = 0; //로컬변수를사용할떄는 final 로 써야함
		
		MyInterface i1 = () -> System.out.println("실행");
		
		MyInterface i2 = new MyInterface() {
			public void method() {
				System.out.println("실행2");
			};
		};
	}
}
