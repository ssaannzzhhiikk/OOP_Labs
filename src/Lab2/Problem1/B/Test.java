package Lab2.Problem1.B;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 2008, 431, "978-0132350884");
        System.out.println(book);
        System.out.println("Pages: " + book.getNumberOfPages());
        System.out.println("ISBN: " + book.getIsbn());
    }
}