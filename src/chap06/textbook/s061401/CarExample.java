package chap06.textbook.s061401;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50); //if문에서 speed가 0보다 작으면 0으로 리턴값을줌
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(myCar.isStop()) {
			myCar.setStop(true);			
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
