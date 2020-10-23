package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("프로그램 실행1");

		try {
			System.out.println("프로그램 실행 try 1");

			Class.forName("java.lang.String");
			// forName 은 ClassNotFoundException이 나타날수있음 .
			
			System.out.println("프로그램 실행 try 2 ");
		} catch (ClassNotFoundException e) {
			System.out.println("익셉션 발생!!!!!!");
		} finally { // 어떤상황이든 무조건 실행함
			System.out.println("무조건 실행 !!");
		}
		
		System.out.println("프로그램 실행2");
	}
}
