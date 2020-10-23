package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		// 순서가 없고 , 중복되지 않음
		Set<String> set = new HashSet<>();
		
		// 추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("jsp");
		set.add("dbms");
		set.add(new String("java"));		// 위에 java와 중복되므로 들어가지않음 , 새로운객체로해도 equals가 성립되므로 중복x
		
		System.out.println(set.size());
		
		//삭제
		set.remove("jquery");				// set은 순서가없으므로 set.remove(1) 이런식으로 지울수없다.
		System.out.println(set.size());
		set.remove(new String("html"));		//set.remove("html"); 과 효과는 같음		
		System.out.println(set.size());
		
		//검색 ( 모두 탐색 ) > 순서가 없기때문
		System.out.println("========향상된 for======");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("=======Iterator=======");
		Iterator<String> iter = set.iterator();
//		iter.hasNext();						// boolean형 타입으로 리턴
//		iter.next();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}
}
