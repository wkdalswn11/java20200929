package chap05.lecture;

public class ReferenceType4 {
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java"); // str1과 str2 는 같은 참조값을 같지만
										 // str3과는 다른 참조값을가진다.
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str3)); //참조값은 다르지만 문자열은 같아서
											   // true 가 나오게 된다.
	}

}
