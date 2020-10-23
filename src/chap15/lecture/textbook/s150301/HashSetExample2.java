package chap15.lecture.textbook.s150301;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set= new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));		// hashCode와 equals 메소드를 사용하여  둘다 같은객체로 침
		set.add(new Member("홍길동", 30));		// 위와 동일하므로 객체는 1개만 저장
		
		System.out.println("총 객체수 : " + set.size());
	}
}
