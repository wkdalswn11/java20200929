package chap11.object.hashcode;

public class HashCodeEx1 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1);
		System.out.println(o2);
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		System.out.println("-----------------------");
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1.hashCode());  // 모든클래스가 hashCode를 썻을때 참조값을 리턴하는것은아님
		System.out.println(s2.hashCode()); 	// 여기서는 override를 했기때문에 같은값이지만 false가 나옴 
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); // equals 메소드가 true 가 나오려면 hashCode가 같아야함
	}
}
