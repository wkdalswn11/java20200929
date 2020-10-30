package chap14.lecture.api.predicate;

import java.util.Random;
import java.util.function.Supplier;

class Car {
	
}
public class MethodRefEx1 {
	public static void main(String[] args) {
		Supplier<Double> random = () -> Math.random();
		Supplier<Double> ran2 = Math::random;			//유추가능하다면 참조가능
		
		Random rand = new Random();
		System.out.println(rand.nextDouble());	// 0~1 사이에 수 중에 랜덤
		System.out.println(rand.nextInt());		// Integer가 표현할수있는 수 중에서 랜덤
		
		Supplier<Integer> nextInt = () -> rand.nextInt();	//위아래가 같은표현임
		Supplier<Integer> nextInt2 = rand::nextInt;
		
		Supplier<Car> nextCar = () -> new Car();			//위아래가 같은표현임
		Supplier<Car> nextCar2 = Car::new;
	}
}
