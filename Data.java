package Collection;

public class Data {
	int book_id;
	String title;
	String author_first_name;
	String author_last_name;
	int no_of_pages;
	double price;
	int no_of_books;
	double cost_of_bks;
	
	
	public void reportStuff(){
		System.out.println("The title of the book is " + title);
		System.out.println("The first name of the author is " + author_first_name + ".");
		System.out.println("The last name of the author is " + author_last_name + ".");
		System.out.println("The price of the book is $" + price);
		System.out.println("The number of pages is " + no_of_pages);
	}
	public void costOfBooks(){
		cost_of_bks = price * no_of_books;
		System.out.println("There are " + no_of_books + " copies of this book.");
		System.out.println("The total cost of these books is $" + cost_of_bks);
	}
}
