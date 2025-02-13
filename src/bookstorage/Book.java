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
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	this.ISBN = iSBN;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
//METHODS
/**
 * This function checks in the current book is equal to another
 * @param other-the imported book in order to compare
 * @return
 */
public boolean equals(Book other) {
	if(this.ISBN == other.ISBN) {
		return true;
	}
	return false;
}

@Override
	public String toString() {
		return "[Book: Title = "+title+", Author = "+author+", ISBN = "+ISBN+", Price = "+price+"]";
	}

}
