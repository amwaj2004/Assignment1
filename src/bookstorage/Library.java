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
	 * @param book; this is the book it's adding
	 * @return; if it finds an open space and adds the book it will return true
	 * 			other-wise it will return false
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

}	


 