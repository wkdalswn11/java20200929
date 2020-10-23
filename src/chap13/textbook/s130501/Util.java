package chap13.textbook.s130501;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2); // Double.compare() 메소드는 첫번째 매개값이 작으면 -1
	}								   // 같으면 0을 크면 1을 리턴
}
