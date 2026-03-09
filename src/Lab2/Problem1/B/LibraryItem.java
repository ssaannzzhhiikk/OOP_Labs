package Lab2.Problem1.B;

public abstract class LibraryItem {
    private final String title;
    private final String author;
    private final int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }

    public abstract String getItemType();

    @Override
    public String toString() {
        return getItemType() + " | Title: " + title + ", Author: " + author + ", Year: " + publicationYear;
    }
}
