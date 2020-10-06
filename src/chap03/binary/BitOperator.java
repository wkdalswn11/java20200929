package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		// ~ 반전 
		int i = 10;
		int j = ~i;
		System.out.println(j);
		
		// 이항
		// & and : 같은 자리의 bit가 1인 경우만 1 , 나머지 0
		// | or :  같은 자리의 bit 가 0 인경우에만 0, 나머지 1
		// ^ xor : 같은 자리의 bit 가 다를 경우 1, 같으면 0
		// 피연산자 : integer
		// 결과 :  integer
		int a = 45; // 0010 1101 > 45
		int b = 25; // 0001 1001 > 25
		int c = a & b;
		System.out.println(c); // 0000 1001 즉 9가나옴
		c = a | b;
		System.out.println(c); // 0011 1101 즉 61이 나옴
		c = a ^ b;
		System.out.println(c); // 0011 0100 즉 52가 나옴
		
		// bit shift 연산자
		// << : 각 bit를 왼쪽으로 옮김, 오른쪽은 0으로 채움
		// >> : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Significant Bit) 최상위 비트로 채움
		// >>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 0으로 채움
		
		int val = 3;
		int res = val << 3;
		System.out.println(res);
		
		val = 98;
		res = val >> 2;
		System.out.println(res);
		
		val = -17;
		res = val >> 2;
		System.out.println(res);
		
		val = 98;
		res = val >>> 2;
		System.out.println(res);
		
		val = -17;
		res = val >>>2;
		System.out.println(res);
		
		
	}

}
