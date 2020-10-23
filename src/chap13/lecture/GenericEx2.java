package chap13.lecture;

public class GenericEx2 {
	public static void main(String[] args) {
		MyClass2<Number> o1 = new MyClass2<>();
		MyClass2<Integer> o2 = new MyClass2<>();
//		MyClass2<Object> o3 = new MyClass2<>(); //Number의 하위 클래스만가능하므로 Object는 불가
 	}
}
