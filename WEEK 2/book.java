
class Book {
    int bookId;
    String title;
    String author;
    double price;

    static int totalBooks = 0;

    // Constructor
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

    // Display book information
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
        System.out.println();
    }

    // Search by Book ID
    void search(int id) {
        if (bookId == id)
            System.out.println("Book found: " + title);
        else
            System.out.println("Book ID not found");
    }

    // Search by Title
    void search(String name) {
        if (title.equalsIgnoreCase(name))
            System.out.println("Book found: " + title);
        else
            System.out.println("Book Title not found");
    }

    // Return the costlier book
    Book costlierBook(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
    }

    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming",
                           "James", 500);

        Book b2 = new Book(102, "Python Programming",
                           "Guido", 650);

        Book b3 = new Book(103, "C Programming",
                           "Dennis", 400);

        System.out.println("BOOK DETAILS");
        b1.display();
        b2.display();
        b3.display();

        System.out.println("SEARCH OPERATIONS");

        b1.search(101);
        b2.search("Python Programming");

        System.out.println("\nCOSTLIER BOOK");

        Book expensive = b1.costlierBook(b2);
        expensive.display();

        System.out.println("Total Books Created: " +
                           Book.totalBooks);
    }
}
