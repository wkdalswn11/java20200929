package chap06.textbook.s060702;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		//Car myCar = new Car(); (x)  이미  Car(파라미터)로 불러왔기때문에 자동으로 Car()가 생성되지 않는다
		//							  Car(파라미터)를 생성하지않으면 Car()자동생성이 되는데 반해 생성했으면 
		//								자동 생성이 되지않음
	}
}
