package chap10.lecture.runtimeExceptions;

public class NullPointerExceptionEx {  //실행해야 알수있는 runtimeException 임
	public static void main(String[] args) {
		int[] a = null;
		
		System.out.println(a.length);
	}
}
