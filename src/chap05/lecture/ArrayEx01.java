package chap05.lecture;

public class ArrayEx01 {
	public static void main(String[] args) {
		int i1 = 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;

		int[] arr1;// int 배열 타입
		arr1 = new int[3]; // []안에 몇개를 저장할지 표시

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);  오류

		arr1[0] = 99;
		arr1[1] = 88;
		arr1[2] = 77;

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		int[] arr2;
		arr2 = arr1; // 둘은 같은 참조값을 갖고있으므로
		arr2[0] = 55; // arr2[0] 의 값을 바꾸면 arr1[0] 의 값도 바뀜
		
		
		System.out.println(arr2[0]);
		System.out.println(arr1[0]);


	}

}
