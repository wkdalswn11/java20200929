package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
										//카피본 		      원본의 길이
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//				 원본       복사하려는		 카피본의
		//							시작인덱스		 시작인덱스
		for (int i = 0; i <newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
