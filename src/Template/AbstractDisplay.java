package Template;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	// displayメソッドは小クラスがオーバーライドできないようにする
	// 小クラスはopen print closeの具体的な内容を実装する
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
