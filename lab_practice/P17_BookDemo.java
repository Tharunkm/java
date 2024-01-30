package lab_practice;
//import lab_practice.P17_Author;
//import lab_practice.P17_Book;

public class P17_BookDemo {
    public static void main(String[] args) {
        // Creating an Author
        P17_Author author = new P17_Author("Tharun", "tharunkm000@gmail.com", 'M');
 
        // Creating a Book with the Author
        P17_Book book = new P17_Book("Programming", author, 129.99, 100);

        // Printing all details of the book, including author details
        System.out.println("Book Name: " + book.getName());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
    }
    
	

}
