package booksystem;

import bookstorage.Book;
import bookstorage.Library;

public class LibraryApp {
	public static void main(String[] args)
	{
		Library userLibrary = new Library();
		Book firstBook = new Book("This Code", "Kayln and Amwaj", "1111", 99.99);
		Book secondBook = new Book("The fault in our stars", "John Green", "1112", 20.99);
		Book thirdBook = new Book("NO DAVID", "David Shannon", "1113", 16.20);
		System.out.println("Adding the first book");
		userLibrary.addBook(firstBook);		
		System.out.println("Adding the second book");
		userLibrary.addBook(secondBook);
		System.out.println("Adding the third book");
		userLibrary.addBook(thirdBook);
		
	//searching by ISBN
		System.out.println(userLibrary.searchByISBN("1111"));
	
	//removing a book that exists
		if(userLibrary.removeBook("The fault in our stars")) {
			System.out.println("The book has been removed");
		}
	}
}
