package bookstorage;

public class Book {
 private String title;
 private String author;
 private String ISBN;
 private double price;
 
public Book() {
	this.title = "Unknown";
	this.author = "Unknown";
	this.ISBN = "Unknown";
	this.price = 0.0;
}
public Book(String InTitle, String InAuthor, String InISBN, double InPrice) {
	this.title = InTitle;
	this.author = InAuthor;
	this.ISBN = InISBN; 
	this.price = InPrice;
}
}
