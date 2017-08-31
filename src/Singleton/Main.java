package Singleton;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("start.");
		// getInstanceはstaticなため、newせずに使える
		// 最初に呼び出したときに、Singletonクラスは初期化される
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("obj1とobj2は同じインスタンス" );
		} else {
			System.out.println("obj1とobj2は違うインスタンス");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(TicketMaker.getInstance().getNextTicketNumber());
		}

		System.out.println(Triple.getInstance(2));
		
		System.out.println("End.");
	}
}
