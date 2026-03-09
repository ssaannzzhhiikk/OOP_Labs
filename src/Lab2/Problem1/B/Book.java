package Lab2.Problem1.B;

public class Book extends LibraryItem {
    private final int numberOfPages;
    private final String isbn;

    public Book(String title, String author, int year, int pages, String isbn) {
        super(title, author, year);
        this.numberOfPages = pages;
        this.isbn = isbn;
    }

    public int getNumberOfPages() { return numberOfPages; }
    public String getIsbn() { return isbn; }

    @Override
    public String getItemType() { return "Book"; }

    @Override
    public String toString() {
        return super.toString() + ", Pages: " + numberOfPages + ", ISBN: " + isbn;
    }
}
