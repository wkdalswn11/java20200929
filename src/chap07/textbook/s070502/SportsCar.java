package chap07.textbook.s070502;

public class SportsCar extends Car{
	@Override
	public void speedUp() { speed += 10; }
	
	오버라이딩 할수없음
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
		
	}
}
