package Iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("test1"));
		bookShelf.appendBook(new Book("test2"));
		bookShelf.appendBook(new Book("test3"));
		bookShelf.appendBook(new Book("test4"));
		
		Iterator it = bookShelf.iterator();
		
		// 次の要素が存在するまで続ける
		while(it.hasNext()) {
			// 次の要素を取得する
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
