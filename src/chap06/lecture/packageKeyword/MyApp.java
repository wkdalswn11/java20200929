package chap06.lecture.packageKeyword;

import java.util.Scanner; // 컨트롤 쉬프트 o 하면 필요한 패키지가 생성됨
import java.util.*; // 모든 java.util의 패키지를 다 넣어줌
//import java.lang.String; // java.lang 에 있는 것들은 생략가능

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 
		= new chap06.lecture.packageKeyword.MyClass();
		
		MyClass o2 = new MyClass();
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		java.lang.String str = "java";
		String str2 = "css";
		
		ArrayList list = new ArrayList();
	}
}
