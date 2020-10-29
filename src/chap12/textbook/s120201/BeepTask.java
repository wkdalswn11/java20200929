package chap12.textbook.s120201;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1 ; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}
}
