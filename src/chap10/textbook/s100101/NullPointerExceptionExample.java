package chap10.textbook.s100101;

public class NullPointerExceptionExample {
	public static void main(String[] args) {

		System.out.println("프로그램 실행중1");

		String data = null;

		if (data != null) {
			System.out.println(data.toString());
		}
		System.out.println("프로그램 실행중2");
	}
}
