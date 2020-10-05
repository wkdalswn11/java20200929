package chap02.textbook;

public class Exercises {
	public static void main(String[] args) {
		// 1번 문제
		int newVar;
//		System.out.println(newVar);
		
		// 2번 문제 
		int modelName;
		int $value;
		int _age;
		
		// 3번 문제
		//byte  short,char 	int		long
		//					float 	double
		//boolean
		
		// 4번 문제
		int age;
		age = 10;
		double price = 3.14;
		// 타입: int double
		// 변수이름: age price
		// 리터럴: 10, 3.14
		
		//5 5번 문제
		byte byteValue = 10;
		char charValue = 'A';
		
//		short shortValue = charValue; 둘다 2btye지만 저장형식이다름
		
		// 6번 문제
		int intValue = 10;
//		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
//		char var = (char) strValue; 기본타입과 참조타입은 서로 형변환불가
		
		// 7번 문제
//		char var3 = '';
		
		// 8번 문제
//		byte byteValue = 10;
		float floatValue = 2.5F;
//		double doubleValue = 2.5;
		
//		byte result = byteValue + byteValue; > 값이 4바이트가 되기때문에
		// int 형으로 하거나 byte타입으로 형변환해야함 
		int result = byteValue + byteValue;
		byte result2 = (byte) (byteValue + byteValue);
		}

}
