package chap06.lecture;

import java.util.Comparator;

public class MyAppAPI {
	public static void main(String[] args) {
		String s = new String("java");
		Comparator<String> a = s.CASE_INSENSITIVE_ORDER;

		String t = new String(new char[] { 'h', 't', 'm', 'l' });
		System.out.println(t);
		char c = t.charAt(1);
		System.out.println(c);
	}
}
