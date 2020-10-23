package chap09.textbook.Exercise.p06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
//		nickName = chatId;  		// final 값이 되어야함
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
		chat.sendMessage(chatId);
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
