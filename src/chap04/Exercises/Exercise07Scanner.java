package chap04.Exercises;

import java.util.Scanner;

public class Exercise07Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력");
		String line = scanner.nextLine();
		
		System.out.println("출력");
		System.out.println(line);
		
		int num = Integer.valueOf(line); //값을 Integer 형으로 변환 할때 씀
		int i = num * 2;
		System.out.println(i);
		
	}

}
