package chap02.type.casting;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
//		int intValue2 = intValue + longValue; int타입보다 long 타입이 더커서 담을수없음
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		
//		int intValue3 = intValue + doubleValue; 여기값은 실수라서 int에 담을수 없음
		double doubleValue2 = intValue + doubleValue;
		
		// 정수형의 연산결과는 int (long 제외)
		short shortValue1 = 3;
		short shortValue2 = 5;
//		short shortValue3 = shortValue1 + shortValue2;
		int intValue4 = shortValue1 + shortValue2; 
		
	}

}
