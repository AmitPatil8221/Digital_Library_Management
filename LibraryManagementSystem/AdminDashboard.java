package LibraryManagementSystem;

import javax.swing.*;
//import java.awt.event.*;

public class AdminDashboard {
    private final JFrame frame;

    public AdminDashboard(User user) {
        frame = new JFrame("Admin Dashboard - Welcome " + user.getUsername());

        JLabel welcomeLabel = new JLabel("Welcome, Admin: " + user.getUsername());
        welcomeLabel.setBounds(30, 20, 300, 30);

        JButton addBookButton = new JButton("Add Book");
        addBookButton.setBounds(50, 70, 150, 30);

        JButton deleteBookButton = new JButton("Delete Book");
        deleteBookButton.setBounds(50, 120, 150, 30);

        JButton viewBooksButton = new JButton("View All Books");
        viewBooksButton.setBounds(50, 170, 150, 30);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(50, 220, 150, 30);

        // Add actions
        addBookButton.addActionListener(e -> addBook());
        deleteBookButton.addActionListener(e -> deleteBook());
        viewBooksButton.addActionListener(e -> viewBooks());
        logoutButton.addActionListener(e -> {
            frame.dispose();
            new LoginPage();
        });

        frame.setSize(300, 350);
        frame.setLayout(null);
        frame.add(welcomeLabel);
        frame.add(addBookButton);
        frame.add(deleteBookButton);
        frame.add(viewBooksButton);
        frame.add(logoutButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void addBook() {
        String id = JOptionPane.showInputDialog("Enter Book ID:");
        String title = JOptionPane.showInputDialog("Enter Book Title:");
        String author = JOptionPane.showInputDialog("Enter Book Author:");

        if (id != null && title != null && author != null) {
            LibraryDatabase.books.add(new Book(id, title, author));
            JOptionPane.showMessageDialog(null, "Book added successfully!");
        }
    }

    private void deleteBook() {
        String id = JOptionPane.showInputDialog("Enter Book ID to delete:");

        boolean removed = LibraryDatabase.books.removeIf(book -> book.getId().equalsIgnoreCase(id));

        if (removed) {
            JOptionPane.showMessageDialog(null, "Book deleted.");
        } else {
            JOptionPane.showMessageDialog(null, "Book not found.");
        }
    }

    private void viewBooks() {
        StringBuilder sb = new StringBuilder("Books in Library:\n\n");
        for (Book book : LibraryDatabase.books) {
            sb.append(book.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
