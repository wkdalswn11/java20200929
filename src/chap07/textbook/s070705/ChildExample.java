package chap07.textbook.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";  		//자동 타입 변환
		parent.method1();
		parent.method2();
		
		/*
		 * parent.fleld2 = "data" 	// 불가능
		 * parent.method3();      	// 불가능
		 */
		
		Child child = (Child) parent;    // 강제 타입 변환
		child.field2 = "yyy"; //가능
		child.method3(); //가능
			
	}
}
