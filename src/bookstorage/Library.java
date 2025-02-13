
package bookstorage;


public class Library {
	private Book[] books;
	private int count;
	
	/** 
	 * Default constructor; initalize Library attributes
	 */
	public Library() {
		this.books = new Book[5];
		this.count = 0;
	}
	
	/**
	 * This method adds a book into the Book array if there is an open space
	 * It will increment the count if it adds a book
	 * @param book; this is the book it's adding
	 * @return; if it finds an open space and adds the book it will return true
	 * other-wise it will return false
	 */
	public boolean addBook(Book book) {
		for(int i = 0; i < books.length; i++) {
			if(books[i] == null) {
				books[i] = book;
				count++;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method removes a book from the Book array if it matches the given 'book'
	 * It will decrement the count if it removes one
	 * @param book; this is the book we're removing
	 * @return; if it finds the book we're trying to remove it will remove it and return true
	 * other-wise it will return false
	 */
	public boolean removeBook(Book book) {
		for(int i = 0; i < books.length; i++) {
			if(books[i] == book) {
				books[i] = null;
				count--;
				return true; 
			}
		}
		return false;
	}
	
	/**
	 * This method searches for a book using the ISBN
	 * @param ISBN; the ISBN string we need to find
	 * @return; returns the book if it finds a matching ISBN 
	 * otherwise it returns null
	 */
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i < books.length; i++) {
			if(books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		return null; 
	}

	/**
	 * This method run through the entire list of books and uses the toString 
	 * generated in Book.java to print out the books
	 */
	public void displayBooks() {
		for(int i = 0; i < books.length; i++) {
			if(books[i]!= null) {
				System.out.println(books[i].toString());
			}
		}
	}
}	


 