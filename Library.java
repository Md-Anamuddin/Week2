
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        for (Book existing : books) {
            if (existing.getId() == book.getId()) {
                System.out.println("A book with this ID already exists.");
                return;
            }
        }

        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("\n----- Library Books -----");
        for (Book book : books) {
            book.displayBook();
        }
    }

    public void borrowBook(int bookId, User user) {
        Book book = findBook(bookId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
        } else {
            book.setAvailable(false);
            System.out.println(
                user.getName() + " borrowed \"" + book.getTitle() + "\"."
            );
        }
    }

    public void returnBook(int bookId, User user) {
        Book book = findBook(bookId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (book.isAvailable()) {
            System.out.println("This book has not been borrowed.");
        } else {
            book.setAvailable(true);
            System.out.println(
                user.getName() + " returned \"" + book.getTitle() + "\"."
            );
        }
    }

    private Book findBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
