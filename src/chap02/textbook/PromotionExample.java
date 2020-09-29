package chap02.textbook;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	//int < byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;		//int < char
		System.out.println("가의 문자 = " + charValue);
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;	//int < long
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//int < double
		System.out.println(doubleValue);
	}

}
