package Adapter;

public class Main {
	public static void main(String[] args) {
		// Printインターフェース型に代入する。 具体的なクラスが変わっても対応できる
		// 実際のBannerクラスのメソッドはここには出てこない
		// Mainクラスを変更せずとも、PrintBannerクラスの実装を変えれる
		Print banner = new PrintBanner("test");
		banner.printStrong();
		banner.printWeak();
	}
}
