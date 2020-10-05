package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		// 논리연산자
		// && & and
		// || | or
		// ^ xor (exclusive or, 배타적논리합) : 다를 때만 true
		System.out.println("===== and =====");	// 둘다 true일때만 true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("===== or =====");	// 둘중 하나라도 true면 true
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		System.out.println("===== xor =====");	// 둘이 다를때만 true	
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		
		System.out.println("============ & | ================");
		int a = 3;
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println((a < 0) & (a++ < 0)); // & | 는 앞에 거짓일경우 에도
		System.out.println(a);					 // 뒤를 판단함
		
		System.out.println("======== && || ==========");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println((a < 0) && (a++ < 0)); // && || 는 앞에 거짓일경우 
		System.out.println(a);					  // 뒤를 판단안함
		
	}

}
