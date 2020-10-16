package chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		KindaCat k1 = t1;
//		t1 = k1;
		k1.cry();
		
		Cat c1 = new Cat();
		c1.cry();
		KindaCat k2 = c1;
		c1.cry();
		
		KindaCat k3 = new KindaCat();
		k3.cry();
	}
}
