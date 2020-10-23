package chap15.lecture.textbook.s150301;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
			
			set.remove("JDBC");
			set.remove("iBATIS");
			
			System.out.println("총 객체수: " + set.size());
			
			iterator = set.iterator();
			while(iterator.hasNext()) {
				String element1 = iterator.next();
				System.out.println("\t" + element1);
			}
			
			set.clear();
			if(set.isEmpty()) {
				System.out.println("비어있음");
			}
		}
	}

