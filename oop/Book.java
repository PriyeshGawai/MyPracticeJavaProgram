package oop;

//Construction overloding
public class Book {
	
	String title;
	String author;
	double price;
	
	public Book(String title) {
		this.title=title;
	}
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
	public Book(String title, String author, double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}

	public void display() {
		System.out.println("Title: "+title);
		System.out.println("author: "+author);
		System.out.println("price: "+price);
	}
	public static void main(String[] args) {
		Book b1=new Book("Animal Farm");
		Book b2=new Book("Animal Farm", "George Orwell");
		Book b3=new Book("Animal Farm", "George Orwell",50.00);
		
		b1.display();
		b2.display();
		b3.display();
		
		
	}

}
