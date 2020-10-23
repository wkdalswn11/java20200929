package chap15.lecture.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		//	순서가 있고 중복허용
		List<String> list = new ArrayList<>();		//list는 인터페이스임
		
		//	추가
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("java");
		
		System.out.println(list.size());		//list의 크기를 아는 메소드는 size
		
		//	검색
		System.out.println(list.get(0));		//list.get(0) 은 0번 인덱스를 검색
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		//수정
		list.set(3, "jsp");						//list.set(3, "jsp"); 는 3번인덱스를 jsp로 바꿈
		
		System.out.println(list.get(3));
		
		//삭제
		list.remove(2);							//list.remove(2) 는 2번째 인덱스를 지우고 한칸씩땡김
		
		System.out.println(list.get(2));
		
		// 모든 값 탐색
		System.out.println("모든 요소 탐색");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("모든 요소 탐색 향상된 for");
		for (String s : list) {
			System.out.println(s);
		}
		
		List<Integer> listInt = new ArrayList<>();
		list.add("servlet");
		listInt.add(3);
		
		List listNotype = new ArrayList();
		listNotype.add("string");
		listNotype.add(3);
		
		Object o1 = listNotype.get(0);		//예외발생 가능성이있음 <>이 없어서
		Object o2 = listNotype.get(1);		//예외발생 가능성이있음 <>이 없어서
		
		System.out.println(o1);
		System.out.println(o2);
		
	}
}







