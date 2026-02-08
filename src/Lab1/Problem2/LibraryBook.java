package Lab1.Problem2;

// LibraryBook.java
// No package so you can drop it into your project root
// Straight copy from GPT
// If you are copying, ignore this class



public class LibraryBook {
    // enum for genres
    public enum Genre {
        FICTION, NONFICTION, SCIENCE, HISTORY, FANTASY, MYSTERY
    }

    // static final: constant shared by all books
    public static final String LIBRARY_NAME = "Central University Library";

    // static non-final: count of created books (modifiable)
    private static int totalBooks = 0;

    // final non-static: read-only after construction (unique per instance)
    private final int bookId;

    // read-only field (final), exposed via getter only
    private final String isbn;

    // non-final instance fields
    private String title;
    private String author;
    private Genre genre;

    // initialization block - runs before constructors
    {
        // increment counter and assign ID based on it
        totalBooks++;
        // bookId cannot be assigned here because constructor might want other logic,
        // but we can prepare or log — we'll leave id assignment to constructors to show `this` usage twice.
    }

    // Constructor 1: default
    public LibraryBook() {
        this.bookId = totalBooks;          // this usage #1
        this.isbn = "UNKNOWN";
        this.title = "Untitled";
        this.author = "Unknown";
        this.genre = Genre.NONFICTION;
    }

    // Constructor 2: full
    public LibraryBook(String isbn, String title, String author, Genre genre) {
        this.bookId = totalBooks;          // this usage #2
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    // Overloaded setters: method overloading example
    public void setLocation(String shelf) {
        // assign or print location — dummy example
        System.out.printf("Placing book '%s' on shelf %s%n", title, shelf);
    }

    public void setLocation(String shelf, int position) {
        System.out.printf("Placing book '%s' on shelf %s at position %d%n", title, shelf, position);
    }

    // Read-only getter for isbn
    public String getIsbn() {
        return isbn;
    }

    public int getBookId() {
        return bookId;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    @Override
    public String toString() {
        return String.format("LibraryBook{id=%d, title=%s, author=%s, isbn=%s, genre=%s}",
                bookId, title, author, isbn, genre);
    }
}

