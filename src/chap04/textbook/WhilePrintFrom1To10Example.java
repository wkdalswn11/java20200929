package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("=================");
		 i = 11;
		while (i <= 20) {
			System.out.println(i);
			i++;
		}
		System.out.println("================");
		int q = 1;
		while (q <= 9) {
			System.out.println(q);
			q += 2;
		}
		System.out.println("================");
		int w = 10;
		while (w >= 1) {
			System.out.println(w);
			w--;
		}
		System.out.println("=================");
		int r = 10;
		while (r >= 1) {
			System.out.println(r);
			r -= 2;
		}
	}

}
