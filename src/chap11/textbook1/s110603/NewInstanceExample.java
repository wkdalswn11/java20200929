package chap11.textbook1.s110603;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz1 = Class.forName("chap11.textbook1.s110603.SendAction");
			Class clazz2 = Class.forName("chap11.textbook1.s110603.ReceiveAction");

			Action action = (Action) clazz1.newInstance(); //newInstance() object 타입을 리턴
			Action action2 = (Action) clazz2.newInstance();

			action.execute();
			action2.execute();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
