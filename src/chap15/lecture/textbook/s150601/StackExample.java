package chap15.lecture.textbook.s150601;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(100)); 		// 동전을 끼움	//push > 주어진 객체를 스택에 넣는다
		coinBox.push(new Coin(50)); 		// 동전을 끼움
		coinBox.push(new Coin(500)); 		// 동전을 끼움
		coinBox.push(new Coin(10)); 		// 동전을 끼움

		while (!coinBox.isEmpty()) { 		// 동전케이스가 비었는지 확인
			Coin coin = coinBox.pop(); 		// 동전케이스에서 제일 위의 동전 꺼내기	// pop() >> 스택의 맨 위 객체를 가져온다,
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");			// pop() >> 객체를 스택에서 제거한다
		}																			// peak() >> 스택의 맨 위 객체를 가져온다,
	}																				// peak() >> 객체를 스택에서 제거하지 않는다
}	
