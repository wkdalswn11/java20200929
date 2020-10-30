package chap14.lecture.nested;

public class NestedEx2 {
	private int outterField;
	
	public void method() {
		MyInterface i1 = () -> {
			int outterField = 3;
			System.out.println("익명의 클래스의 객체 (local class)");
			System.out.println(this);
			System.out.println(outterField);
			System.out.println(NestedEx2.this.outterField);
			
		};
		i1.method();
	}
	
	public static void main(String[] args) {
		NestedEx2 n2 = new NestedEx2();
		n2.method();
	}
}
