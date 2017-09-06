package Composite;

public class File extends Entry {
	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	protected void printList(String prefix) {
		// + 演算子 に thisをつけると toString()が呼ばれる
		System.out.println(prefix + "/" + this);
	}
	
}
