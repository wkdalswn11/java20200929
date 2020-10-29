package chap12.textbook.s120201;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("땅");
			try {
				Thread.sleep(5000);
			} catch(Exception e) {
				e.printStackTrace();			}
		}
	}
}
