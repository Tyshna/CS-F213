package week8;
import java.util.*;
class BookTester 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books to create: ");
        int numBooks = scanner.nextInt();
        LinkedList<Book> bookList = new LinkedList<>();
        for (int i = 0; i < numBooks; i++)
        	{
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("ISBN No: ");
            long ISBN_no = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Edition: ");
            int Edition = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Author: ");
            String Author = scanner.nextLine();
            System.out.print("Publisher: ");
            String Publisher = scanner.nextLine();
            Book book = new Book(ISBN_no, name, Edition, Author, Publisher);
            bookList.add(book);
            }//for
        System.out.println("\nCreated books:");
        for (Book book : bookList) book.display();
        System.out.println("\nChoose a book to change status (enter its index):");
        int bookIndex = scanner.nextInt();

        if (bookIndex >= 0 && bookIndex < bookList.size()) 
        	{
            Book selectedBook = bookList.get(bookIndex);

            System.out.print("Enter the new status (0: Available, 1: Issued, 2: Reserved): ");
            int newStatus = scanner.nextInt();

            selectedBook.change_Status(newStatus);

            System.out.println("\nUpdated book details:");
            selectedBook.display();
            }//if
        else
            System.out.println("Invalid book index.");
        scanner.close();
    }//main
}//class