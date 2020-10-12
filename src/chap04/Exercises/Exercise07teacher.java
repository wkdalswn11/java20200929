package chap04.Exercises;

import java.util.Scanner;

public class Exercise07teacher {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance =0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.print("선택> ");
			
			String c = scanner.nextLine();
			
			switch (c) {
			case "1":
				System.out.print("예금액> ");
				String moneyStr1 = scanner.nextLine();
				int money1 = Integer.valueOf(moneyStr1);  
				balance = balance + money1;
				break;
			case "2":
				System.out.println("출금액> ");
				String moneyStr2 = scanner.nextLine();
				int money2 = Integer.valueOf(moneyStr2);
				balance = balance - money2;
			case "3":
				System.out.println("잔고> " + balance);
				break;
			case "4":
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
