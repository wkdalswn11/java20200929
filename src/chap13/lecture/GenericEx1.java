package chap13.lecture;

public class GenericEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();	// 아무것도 쓰지않으면 Object클래스로 적용이므로 다쓸수있음
		o1.method1();
		o1.method2(new Object());
		o1.method2("java");
		o1.method2(300);
		
		MyClass<String> o2 = new MyClass<>(); // 앞에 <String>을했으면 뒤에 <>로 안에것을 생략가능함
		o2.method1();
		o2.method2("java");
//		o2.method2(new Object()); // Object는 String 타입이 아니라서 쓸수없음
		
		MyClass<Integer> o3 = new MyClass<>(); // 앞에 <Integer>을했으면 뒤에 <>로 안에것을 생략가능함
		o3.method2(100);
//		o3.method2("java"); // Integer타입으로 변환했으니 String타입은 쓸수없음
	}
}
