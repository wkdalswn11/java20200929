package chap06.textbook.s061303.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;  	//private는 같은 클래스내에서만 가능
		
		a.method1();
		a.method2();
//		a.method3(); 	//private는 같은 클래스내에서만 가능
	}
}
