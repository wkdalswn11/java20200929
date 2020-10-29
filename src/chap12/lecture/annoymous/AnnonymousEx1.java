package chap12.lecture.annoymous;

public class AnnonymousEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println((char) ('a' + i));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread t3 = new Thread(() -> { // 인터페이스중에 추상메소드를 하나만 가지고있으면 람다식을 사용할수있다
			for (int i = 0; i < 5; i++) {
				System.out.println((char) ('Z' - i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t3.start();
	}
}
