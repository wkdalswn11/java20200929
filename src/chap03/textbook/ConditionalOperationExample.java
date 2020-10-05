package chap03.textbook;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
//						1 항		2항				3항
		//										1항 	  2항	3항
		System.out.println(score + "점은" + grade + "등급입니다.");
	}

}
