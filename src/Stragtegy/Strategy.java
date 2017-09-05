package Stragtegy;

public interface Strategy {
	// 次に出す手を得る
	public abstract Hand nextHand();
	// 以前の手によって勝ったかどうかを学習する
	public abstract void study(boolean win);
}
