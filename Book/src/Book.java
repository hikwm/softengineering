import java.util.ArrayList;

public class Book {

	

	public int id;
	public String title;
	public String author;
	public int year;
	
	public Book() {};
	ArrayList<Book> library= new ArrayList<>();
	
	public Book(int id, String title, String author, int year) {
		super();
		this.id=id;
		this.title=title;
		this.author=author;
		this.year=year;
	}
	
	public void addBook(int id, String title, String author, String year) {
		Book Book =new Book();
		library.add(Book);
	}
	
	public int searchBook(int id){	
		library.get(id);
		if (id==0) {
			throw new IllegalArgumentException("도서가 없습니다.");
		}
		return id;
	}
	
	public void deleteBook(int id) {
		library.remove(id);
	}
	
}
