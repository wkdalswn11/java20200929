package chap03.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "장민주";
		String strVar2 = "장민주";
		String strVar3 = new String("장민주");
		
		
		System.out.println( strVar1 == strVar2); // true
		System.out.println( strVar1 == strVar3); // 객체의 참조값을 비교하므로 false 가 나옴 
		System.out.println();
		System.out.println( strVar1.equals(strVar2)); // true
		System.out.println( strVar1.equals(strVar3)); // true
		// strVar1.equals(strVar3) 는 strVar1 과 strVar3 의 '문자열'을 비교하므로
		// true 가 나옴
	}

}
