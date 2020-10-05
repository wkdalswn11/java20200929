package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primirive type 8개
		
		//	1byte  2byte	4byte	8byte
		// boolean char	
		// byte    short	int		long
		//					float	double
		
		byte byteValue	= 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		//자동 형변환
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		//강제 형변환
		longValue = 2300000000L;
		intValue = (int) longValue;
		System.out.println(intValue);
		//변환할 타입을 명시해줘야함 ex: (int)
		
		// 자동형변환 (정수 -> 실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue;
		
		longValue = 9223372036854775807L;
		floatValue = longValue;
		System.out.println(floatValue);
		// floatType 은 longType 보다 넒은 범위를 표현할수있음 대신 값을 잃을수있음
		doubleValue = longValue;
		System.out.println(doubleValue);
		// doubleType 은 longType 보다 넒은 범위를 표현할수있음 대신 값을 잃을수있음

		// 강제 형변환 (실수 -> 정수)
		intValue = (int) floatValue;
		
		
	}
}
