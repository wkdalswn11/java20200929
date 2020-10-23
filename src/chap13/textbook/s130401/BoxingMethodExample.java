package chap13.textbook.s130401;

import chap13.textbook.s130202.Box;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100); // 뒤에있는 <Integer>은 유추가능하므로 생략가능하다.
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	}
}
