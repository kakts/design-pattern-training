package Singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	// classないでしかnewされないようにするために、privateにする
	private Singleton() {
		System.out.println("インスタンスを生成しました");
	}
	
	public static Singleton getInstance() {
		System.out.println("a");
		return singleton;
	}
}
