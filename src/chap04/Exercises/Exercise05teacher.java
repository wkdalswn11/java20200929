package chap04.Exercises;

public class Exercise05teacher {
	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int s = (4 * x) + (5 * y);
				if (s == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

}
