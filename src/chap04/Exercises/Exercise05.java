package chap04.Exercises;

public class Exercise05 {
	public static void main(String[] args) { // for문 이용하여 4x+5y =60의 모든해 (x,y)의형태로

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {

				if ((4 * x) + (5 * y) == 60) {


					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
