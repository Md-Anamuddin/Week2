
abstract class LibraryUser {
    private int userId;
    private String name;

    public LibraryUser(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public abstract void displayRole();
}

public class User extends LibraryUser {
    public User(int userId, String name) {
        super(userId, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Library Member");
    }

    public void displayUser() {
        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        displayRole();
    }
}
