
import java.util.Scanner;

public class LibraryManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();
        User user = new User(101, "Rahul");

        // Add some sample books
        library.addBook(new Book(1, "Java Programming", "James Gosling"));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(3, "Effective Java", "Joshua Bloch"));

        user.displayUser();

        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid book ID.");
                        sc.next();
                        break;
                    }
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();

                    if (title.trim().isEmpty() || author.trim().isEmpty()) {
                        System.out.println("Title and author cannot be empty.");
                        break;
                    }

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter book ID to borrow: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid book ID.");
                        sc.next();
                        break;
                    }
                    library.borrowBook(sc.nextInt(), user);
                    break;

                case 4:
                    System.out.print("Enter book ID to return: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid book ID.");
                        sc.next();
                        break;
                    }
                    library.returnBook(sc.nextInt(), user);
                    break;

                case 5:
                    System.out.println("Thank you for using the library system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Select 1-5.");
            }
        }
    }
}
