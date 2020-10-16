package chap08.textbook.s080201;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10; // 상수라서 대문자로 표시 단어연결은 _ 로 함
	public int MIN_VOLUME = 0; // public static final 생략가능

	// 추상 메소드
	public void turnOn(); // public abstract 생략가능

	public void turnOff();

	public void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) { //interface의 default 는 접근제한자가 아님!! // 앞에 public 생략가능
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() { // public 생략가능
		System.out.println("건전지를 교환합니다.");
	}

}
