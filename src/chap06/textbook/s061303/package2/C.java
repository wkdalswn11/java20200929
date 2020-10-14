package chap06.textbook.s061303.package2;

import chap06.textbook.s061303.package1.*;

public class C {
	public C() {
		A a = new A(); 
		a.field1 = 1;
//		a.field2 = 1; 	//default 는 같은 패키지내에서만 사용가능
//		a.field3 = 1; 	// private 는 같은 클래스내에서만 사용가능
		
		a.method1();
//		a.method2();  	// default 는 같은 패키지내에서만 사용가능
//		a.method3();	// private 는 같은 클래스내에서만 사용가능
	}
}
