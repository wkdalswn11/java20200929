package chap08.textbook.s080601;

public class Example {
	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA(); 					// InterfaceA 변수는 methodA()만 호출가능
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();					// InterfaceB  변수는 methodB()만 호출가능
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();					// InterfaceC 변수는 methodA(), methodB(), methodC()모두 호출가능
		ic.methodB();
		ic.methodC();
	}
}
