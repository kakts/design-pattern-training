package Singleton;

public class TicketMaker {
	private static int ticket = 100;
	
	private static TicketMaker singleton = new TicketMaker();
	private TicketMaker() {
		System.out.println("インスタンスを生成しました");
	}
	
	public static TicketMaker getInstance() {
		return singleton;
	}
	
	// staticでなく、synchronizedにした理由
	// 複数のスレッドから呼び出された時 staticにすると同じ値を返す場合がある
	// 複数スレッドから呼び出されても問題なくするためにはsynchronizedをつける必要がある
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
