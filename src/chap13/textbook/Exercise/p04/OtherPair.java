package chap13.textbook.Exercise.p04;

public class OtherPair<K, V> {
	private K key;
	private V value;
	
	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getkey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
}
