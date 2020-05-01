public class BookClass {

    private String book_title;
    private String author;
    private double price;
    private int number_in_stock;
    private boolean in_stock;
    private String description;
    private double result;

    public BookClass(){          // default constructor

    }

    public BookClass(String book_title, String author, double price, int number_in_stock, String description) {
        this.book_title = book_title;
        this.author = author;
        this.price = price;
        this.number_in_stock = number_in_stock;
        this.description = description;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getNumberInStock() {
        return number_in_stock;
    }

    public void setNumberInStock(int number_in_stock) {
        this.number_in_stock = number_in_stock;
    }

    public boolean isIn_stock() {
        if(number_in_stock > 0){
            in_stock = true;
        }
        else{
            in_stock = false;
        }
        return in_stock;
    }

    public void setIn_stock(boolean in_stock) {
        this.in_stock = in_stock;
    }

    public void getDisplayText(){
        System.out.println("\nBook Title: " + getBook_title());
        System.out.println("Author: " + getAuthor());
        System.out.println("Description: " + getDescription());
    }   // end of getDisplyText() method

    public double bookPrice(int qty, int qty_in_stock, double rate){

        if(qty_in_stock > 0){
            result = qty * rate;
        }
        else{
            System.out.println("Sorry the book is out of stock.");
        }
        return result;
    }

}
