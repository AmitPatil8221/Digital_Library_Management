package LibraryManagementSystem;

import javax.swing.*;

public class UserDashboard {
    private final JFrame frame;

    public UserDashboard(User user) {
        frame = new JFrame("User Dashboard - Welcome " + user.getUsername());

        JLabel welcomeLabel = new JLabel("Welcome, " + user.getUsername());
        welcomeLabel.setBounds(30, 20, 300, 30);

        JButton viewBooksButton = new JButton("View Books");
        viewBooksButton.setBounds(50, 70, 150, 30);

        JButton issueBookButton = new JButton("Issue Book");
        issueBookButton.setBounds(50, 120, 150, 30);

        JButton returnBookButton = new JButton("Return Book");
        returnBookButton.setBounds(50, 170, 150, 30);

        JButton queryButton = new JButton("Send Query");
        queryButton.setBounds(50, 220, 150, 30);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(50, 270, 150, 30);

        viewBooksButton.addActionListener(e -> viewBooks());
        issueBookButton.addActionListener(e -> issueBook());
        returnBookButton.addActionListener(e -> returnBook());
        queryButton.addActionListener(e -> sendQuery());
        logoutButton.addActionListener(e -> {
            frame.dispose();
            new LoginPage();
        });

        frame.setSize(300, 380);
        frame.setLayout(null);
        frame.add(welcomeLabel);
        frame.add(viewBooksButton);
        frame.add(issueBookButton);
        frame.add(returnBookButton);
        frame.add(queryButton);
        frame.add(logoutButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void viewBooks() {
        StringBuilder sb = new StringBuilder("Available Books:\n\n");
        for (Book book : LibraryDatabase.books) {
            sb.append(book.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private void issueBook() {
        String id = JOptionPane.showInputDialog("Enter Book ID to issue:");

        for (Book book : LibraryDatabase.books) {
            if (book.getId().equalsIgnoreCase(id) && !book.isIssued()) {
                book.setIssued(true);
                JOptionPane.showMessageDialog(null, "Book issued successfully!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Book not available or already issued.");
    }

    private void returnBook() {
        String id = JOptionPane.showInputDialog("Enter Book ID to return:");

        for (Book book : LibraryDatabase.books) {
            if (book.getId().equalsIgnoreCase(id) && book.isIssued()) {
                book.setIssued(false);
                JOptionPane.showMessageDialog(null, "Book returned successfully!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Invalid Book ID or Book is not issued.");
    }

    private void sendQuery() {
        String query = JOptionPane.showInputDialog("Enter your query:");
        if (query != null && !query.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Query submitted! Admin will respond soon.");
        }
    }
}
