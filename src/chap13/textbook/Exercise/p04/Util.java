package chap13.textbook.Exercise.p04;

public class Util<K, V> {
	public static <K, V> V getValue(Pair <K, V> p, K k) {
		if (k == p.getKey()) {
			return p.getValue();
		} else {
			return null;
		}
	}
	
	

	
	
}
