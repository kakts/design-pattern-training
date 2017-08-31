package Prototype;

// java.lang.Cloneableインターフェースを継承している
// cloneメソッドを使って自動的に複製を行える
public interface Product extends Cloneable {
	public abstract void use (String s);
	public abstract Product createClone();
}
