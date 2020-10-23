package chap13.textbook.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); // String => Object (자동 타입 변환)
		Object o = box.get();
		if (o instanceof String) {
			String name = (String) o; // Object => String (강제 타입 변환)
		}
		box.set(new Apple()); // Apple => Object (자동 타입 변환)

		o = box.get();
		if (o instanceof Apple) {
			Apple apple = (Apple) o; // Object => Apple (강제 타입 변환)
		}
	}
}
