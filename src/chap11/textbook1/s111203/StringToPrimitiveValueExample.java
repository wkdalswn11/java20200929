package chap11.textbook1.s111203;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14"); //pares 는 기본타입을 리턴
		boolean value3 = Boolean.parseBoolean("true");
		
		int i = Integer.valueOf("30");						//valueOf는 참조값을 리턴 어찌쓰든 크게 상관 x
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}
}
