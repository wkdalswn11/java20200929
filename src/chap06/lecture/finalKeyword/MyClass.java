package chap06.lecture.finalKeyword;

public class MyClass {
	int field1;
	final int field2;
	
	final static int field3 = 20;
	final static int field4;
	
	static {
		field4 = 30;  //final 필드는 무조건 값을 한번은 받아야함 ( 상수처럼 사용 )
	}
	
	public MyClass() {
		field2 = 99;
	}
}
