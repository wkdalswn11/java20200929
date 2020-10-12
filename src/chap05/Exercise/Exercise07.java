package chap05.Exercise;

public class Exercise07 {
	public static void main(String[] args) { // 최대값과 최소값 찾기
		int[] array = { -1, -5, -3, -8, -2 };
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
