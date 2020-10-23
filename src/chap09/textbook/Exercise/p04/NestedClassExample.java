package chap09.textbook.Exercise.p04;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire(); 		// 인스턴스 클래스
				
		Car.Engine engine = new Car.Engine();  // 정적클래스
	}
}
