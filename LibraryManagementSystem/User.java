package LibraryManagementSystem;

public class User {
    private final String username;
    private final String password;
    private final boolean isAdmin;

    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean isAdmin() { return isAdmin; }

    public String getRole() {
        return isAdmin ? "admin" : "user"; // Return role based on isAdmin flag
    }
}