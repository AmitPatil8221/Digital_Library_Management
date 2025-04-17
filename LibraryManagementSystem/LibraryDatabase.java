package LibraryManagementSystem;

import java.util.ArrayList;

public class LibraryDatabase {
    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();

    static {
        // Sample books
        books.add(new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("B102", "1984", "George Orwell"));
        books.add(new Book("B103", "To Kill a Mockingbird", "Harper Lee"));

        // Sample users
        users.add(new User("admin", "admin@123", true));
        users.add(new User("Amit8221", "Patil@8221", false));
    }

    public static User authenticate(String username, String password) {
        for (User  u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public static User validateLogin(String username, String password) {
        // Use the authenticate method to validate login
        return authenticate(username, password);
    }
}