package strings;

import java.util.TreeSet;

public class ToStringExample {
public static void main(String[] args) {
	
	Book b1 = new Book("Thinking Java", 2000, "James", 101);
	System.out.println(b1.name);
	System.out.println(b1);
	
	TreeSet<Book> bookT = new TreeSet<>();
//	bookT.add(b1);
	
	
	
	
	Object b;
	
}
}
class Book{
	
	String name;
	int price;
	String author;
	int id;
	public Book(String name, int price, String author, int id) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", id=" + id + "]";
	}
	
	
	
	
}