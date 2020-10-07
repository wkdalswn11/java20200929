package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {

		// 1 -> 2 -> code -> 3 -> 2

		// 1~10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("-------11~20-------");
		// 11~20
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println("-------1~9홀수만-------");
		// 1~9 홀수만 // i+=2 == i = i + 2 
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("-------10~1-------");
		// 10~1
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("-------10~2짝수만-------");
		// 10~2 짝수만 // i-=2 == i = i - 2 
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}
	}

}
