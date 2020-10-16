package chap07.textbook.s070701;
class A {}

class B extends A {}  // B는 A에 상속
class C extends A {}  // C는 A에 상속

class D extends B {}  // D는 B에 상속
class E extends C {}  // E는 C에 상속

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e; // 상속관계에 있지않음
		//C c2 = d;	// 상속관계에 있지않음
	}
}
