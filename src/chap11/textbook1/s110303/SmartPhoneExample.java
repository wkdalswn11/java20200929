package chap11.textbook1.s110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		SmartPhone IPhone = new SmartPhone("apple", "ios");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		System.out.println(IPhone);
	}
}
