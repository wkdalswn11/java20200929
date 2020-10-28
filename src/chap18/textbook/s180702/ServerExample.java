package chap18.textbook.s180702;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {		// 연결 기다리는쪽이 server
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.29", 5001)); // localhost > 내컴퓨터라는 키워드 ip를 쳐도 됨
			while (true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); // accept() 는 기다린다는 method 임
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				try {
					serverSocket.close();
				} catch (IOException e1) {}		
			}
		}
	}
}
