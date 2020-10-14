package chap06.textbook.Exercise.p18;

public class ShopService {
	private final static ShopService singleton = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return singleton;
	}
}
