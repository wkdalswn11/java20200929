package chap05.lecture;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------");
		for (int n : arr) { // arr[0]의 값이 n에한번 , ...... arr[4]의 값이 n에 적용돼서 나타남 }
			System.out.println(n);
		}
		
	}
}
