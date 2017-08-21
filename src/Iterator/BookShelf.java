package Iterator;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	// 指定したインデックスの本を取得する
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		// 次に追加する本のインデックス番号を加算する
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
