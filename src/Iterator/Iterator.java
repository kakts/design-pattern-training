package Iterator;

// 数え上げ、スキャンを行うインターフェース
public interface Iterator {
	// ループの終了条件で使う
	public abstract boolean hasNext();
	// Iterateの次の要素を返す。 内部的に状態を進める
	public abstract Object next();
}
