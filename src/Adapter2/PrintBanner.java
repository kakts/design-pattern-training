package Adapter2;

// PrintBanner 移譲版
// Bannerを継承せずに、インスタンスを保持する
public class PrintBanner implements Print {
	private Banner banner;
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	
	public void printWeak() {
		banner.showWithParen();
	}
	
	public void printStrong() {
		banner.showWithAster();
	}
}
