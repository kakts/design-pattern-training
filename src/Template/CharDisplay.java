package Template;

// AbstractDisplayを実装し、open close printを実装する
public class CharDisplay extends AbstractDisplay {
	private char ch;
	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	public void open() {
		System.out.print("<<");
	}
	
	public void print() {
		System.out.print(ch);
	}
	
	public void close() {
		System.out.println(">>");
	}
}
