package ChainOfResponsibility;

public abstract class Support {
	private String name;
	private Support next;
	public Support(String name) {
		this.name = name;
	}
	
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	
	public final void support(Trouble trouble) {
		if (resolve(trouble)) {
			// 解決済み
			done(trouble);
		} else if (next != null) {
			// 次のトラブルが設定されている
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}
	
	public String toString() {
		return "[" + name + "]";
	}
	
	// 解決用メソッド 小クラスで実装する
	protected abstract boolean resolve(Trouble trouble); 

	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}
