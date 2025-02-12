package bookstorage;

public class Book {
 private String title;
 private String author;
 private String ISBN;
 private double price;
 
 //CONSTRUCTORS
 /**
  * this is a default constructor that initializes its attributes
  * title - initialized to Unknown
  * author - initialized to Unknown
  * ISBN - initialized to Unknown
  * price - initialized to 0.0
  */
public Book() {
	this.title = "Unknown";
	this.author = "Unknown";
	this.ISBN = "Unknown";
	this.price = 0.0;
}
/**
 * this is a parameterized constructor that initialized the variables to the users input
 * @param InTitle
 * @param InAuthor
 * @param InISBN
 * @param InPrice
 */
public Book(String InTitle, String InAuthor, String InISBN, double InPrice) {
	this.title = InTitle;
	this.author = InAuthor;
	this.ISBN = InISBN; 
	this.price = InPrice;
}
/**
 * this is a copy constructor
 * 1.takes in a object of class Book
 * 2.copies the value from the given object and creates a new one
 * @param copy
 */
public Book(Book copy) {
	this.title = copy.title;
	this.author = copy.author;
	this.ISBN = copy.ISBN;
	this.price = copy.price;
}

//GETTERS AND SETTERS


}
