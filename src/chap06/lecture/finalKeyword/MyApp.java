package chap06.lecture.finalKeyword;

public class MyApp {
	public static void main(String[] args) {
		int i;
		final int j;
		
		i = 30;
		i = 40;
		
		j = 20;
//		j = 30; final 코드가 붙었기 때문에 값을 한번만 바꿀수있다.
		
		MyClass o1 = new MyClass();
		o1.field1 = 3;
//		o1.field2 = 4; final 코드때문에 MyClass에서 값을 무조건 한번받아야하고 여기서는 바꿀수없다
				
	}
}
