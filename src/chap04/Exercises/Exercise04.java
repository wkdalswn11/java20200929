package chap04.Exercises;

public class Exercise04 { //주사위 던져서 a, b 두개합이 5가아니면 계속 5면 스탑
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
	do {	
		 a = (int)(Math.random()*6) + 1;
		 b = (int)(Math.random()*6) + 1;
		 System.out.println("(" + a + "," + b + ")");
	 } while (!(a+b==5));
	
	
	}
}
