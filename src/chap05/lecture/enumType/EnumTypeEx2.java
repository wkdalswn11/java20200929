package chap05.lecture.enumType;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE4;
		System.out.println(e1.name());		//이름을 알려줌
		System.out.println(e1.ordinal());	//몇번째인지 알려줌
		
		MyEnum e2 = MyEnum.valueOf("VALUE3");	// 주어진 문자열의 열거 객체를 리턴
		System.out.println(e2.name());
		
		int diff = e1.compareTo(e2);		//열거 객체를 비교해서 순번 차이를 리턴
		System.out.println(diff);
		
		System.out.println(e2.compareTo(e1));
		
		MyEnum[] arr = MyEnum.values();		//모든 열거 객체들을 배열로 리턴
		System.out.println(arr.length);
	}
}
