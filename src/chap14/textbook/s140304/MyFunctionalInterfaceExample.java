package chap14.textbook.s140304;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(300, 175));

		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method(225, 225));

		fi = (x, y) -> x + y;
		System.out.println(fi.method(175, 225));

		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(369, 131));
	}

	public static int sum(int x, int y) {
		return (x + y);
	}
}
