package chap11.textbook1.s110301;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {									// 매개값이 Member 타입이고 id 필드값도 
			System.out.println("obj1과 obj2는 동등합니다");		// 동일하므로 true
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) { 								// 매개값이 Member 타입이지만
			System.out.println("obj1과 obj3은 동등합니다");		// id 필드값이 다르므로 false
		} else { 
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
 	}
}
