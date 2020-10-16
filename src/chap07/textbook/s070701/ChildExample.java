package chap07.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3(); (호출 불가능) Child 만 갖고있는 메소드라서 Parent 로는 호출불가
	}
}
