package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorEx2 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Member> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new Member(random.nextInt(100), "java"));
		}
		
//							   = new Comparator<Member>(){compare(x,y){return x.getid()-y.getid()}}
//		Comparator<Member> com = (x,y)-> (x.getId()-y.getId());
		
		list.sort((x , y) -> x.getId() - y.getId());
		
		list.forEach(e -> System.out.println(e));
	}
}
