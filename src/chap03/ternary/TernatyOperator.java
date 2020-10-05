package chap03.ternary;

public class TernatyOperator {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항 > 1항이 true면 2항 , 1항이 false 면 3항이 나옴
		// a ? b : c  > a가 true면 b a가 false면 c가 나옴
		// 위 연산의 결과는 b 또는 c
		boolean a = false;
		int b = 3;
		int c = 5;
		
		System.out.println(a ? b : c);
	}

}
