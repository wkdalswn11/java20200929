package chap14.textbook.s140303;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;

		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(50);

		fi = (x) -> {
			System.out.println(x * 5);
		};
		fi.method(5);

		fi = x -> System.out.println(x * 5);
		fi.method(15);

	}
}
