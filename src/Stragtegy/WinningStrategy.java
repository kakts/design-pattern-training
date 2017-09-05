package Stragtegy;

import java.util.Random;

public class WinningStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	private Hand prevHand;
	public WinningStrategy(int seed) {
		random = new Random(seed);
	}
	
	public Hand nextHand() {
		// 前回負けていたらランダムで出す
		if (!won) {
			prevHand = Hand.getHand(random.nextInt(3));
		}
		// 前回勝っていたら同じ手を出す
		return prevHand;
	}
	
	public void study(boolean win) {
		won = win;
	}
}
