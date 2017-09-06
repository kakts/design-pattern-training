package Composite;

public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	
	// サブクラスでオーバーライドされない場合はそのままエラーを返す
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	
	public void printList() {
		printList("");
	}
	
	protected abstract void printList(String prefix);
	
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
