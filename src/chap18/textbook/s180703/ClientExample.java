package chap18.textbook.s180703;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {	//연결을 시도하는쪽이 Client
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();		// Socket 생성
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("172.30.1.39", 5001)); 	//연결 요청
			System.out.println("[연결 성공]");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {		//연결 되어 있을 경우
			try {
				socket.close();			// 연결 끊기
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
