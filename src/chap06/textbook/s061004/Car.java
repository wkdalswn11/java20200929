package chap06.textbook.s061004;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
//		run(); 인스턴스 멤버라서 밑에처럼 객체를 만들어서 써줘야함  
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		Math.random();
		int a = Math.abs(-3);
		
	}
}
