package chap02.variable;

public class VariableScope {
	public static void main(String[] args) {
		// 변수의 사용 범위
		// 선언된 코드 블럭 안에서만 사용가능
		
		int a = 3;
		
		if (true) {
			int b = 5;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b);
	}
}
