package chap04.Exercises;

public class Exercise03 { //1 부터 100까지 정수중 3의 배수 총합
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 3; i <= 100; i+=3) {
			sum += i;
		}
		System.out.println(sum);
	}

}
