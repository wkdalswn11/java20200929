package chap03.binary;

public class ConcatOperator {
	public static void main(String[] args) {
		// 연결연산자 concatenate
		int a = 3;
		int b = 5; 
		int c = a + b;
		
		String s = "9";
		String d  = a + s;
		
		System.out.println(d);
		
		String e = a + b + s;
		System.out.println(e);
		
		String f  = s + b + a; // String 과 int형을 더하면 string 형이나옴
		System.out.println(f);
		
	}

}
