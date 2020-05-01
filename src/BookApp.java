import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        // instantiate scanner object
        Scanner keyboard = new Scanner(System.in);

        // declare variables
        int input;
        int item;
        int qty;
        boolean cont = true;
        double output;


        BookClass book1 = new BookClass("Rich Dad Poor Dad", "Robert Kiyosaki", 11.96, 10, "Financial Independence");

        BookClass book2 = new BookClass("Head First Java", "Robert Kiyosaki", 36.14, 0, "Java Programming");

        // prompt user to choose among available books and enter number of books
        System.out.println("Available books are: ");
        System.out.println("-----------------------");

        System.out.println("1-" + book1.getBook_title());

        System.out.println("2-" + book2.getBook_title());
        System.out.println("-----------------------");

        System.out.print("Enter book's number that you want to buy: ");
        input = keyboard.nextInt();
        item = input;

        do {
            if (item == 1) {
                System.out.println("Author of the book is: " + book1.getAuthor());
            } else if (item == 2) {
                System.out.println("Author of the book is: " + book2.getAuthor());
            } else {
                System.out.println("item number unavailable");
                System.out.println("Thank you.");
                return;
            }

            System.out.print("Enter quantity you want: ");
            input = keyboard.nextInt();
            qty = input;

            if (item == 1) {
                if(book1.getNumberInStock() == 0){
                    System.out.println("Sorry Thia book is out of stock.");
                    cont = false;
                }
                else if (book1.getNumberInStock() >= qty) {
                    output = book1.bookPrice(qty, book1.getNumberInStock(), book1.getPrice());
                    System.out.println("The total price is: " + String.format("$%(,.2f", output));
                    cont = false;
                } else {
                    System.out.println("Sorry we don't have that many in stock.");
                    cont = false;
                }
            } else if (item == 2) {
                if(book2.getNumberInStock() == 0){
                    System.out.println("Sorry This book is out of stock.");
                    cont = false;
                }
                else if (book2.getNumberInStock() >= qty) {
                    output = book2.bookPrice(qty, book2.getNumberInStock(), book2.getPrice());
                    System.out.println("The total price is: " + String.format("$%(,.2f", output));
                    cont = false;
                } else {
                    System.out.println("Sorry we don't have that many in stock.");
                    cont = false;
                }
            }
        } while (cont == true);
    }
}
