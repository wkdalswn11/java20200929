package chap11.textbook1.s110303;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		String s = "java";
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(s.toString());
	}
}
