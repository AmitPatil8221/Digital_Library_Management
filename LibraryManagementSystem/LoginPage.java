package LibraryManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class LoginPage extends JFrame {
    private final JTextField usernameField;
    private final JPasswordField passwordField;

    public LoginPage() {
        setTitle("Digital Library Login");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Load custom font for title
        Font customFont;
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/WinkyRough-SemiBold.ttf")).deriveFont(22f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (Exception e) {
            System.out.println("Custom font not loaded, using default.");
            customFont = new Font("Arial", Font.BOLD, 22);
        }

        // Font for input fields
        Font inputFont = new Font("Bookman Old Style", Font.BOLD, 14);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(30, 30, 60)); // Dark blue

        JLabel titleLabel = new JLabel("Library Login");
        titleLabel.setBounds(150, 30, 300, 40);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(customFont);
        panel.add(titleLabel);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(80, 100, 100, 25);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
        panel.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(180, 100, 200, 25);
        usernameField.setFont(inputFont); // 👈 Bold and darker font for input
        panel.add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(80, 140, 100, 25);
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
        panel.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(180, 140, 200, 25);
        passwordField.setFont(inputFont); // 👈 Bold and darker font for input
        panel.add(passwordField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(180, 200, 100, 30);
        loginBtn.setBackground(new Color(102, 204, 255));
        loginBtn.setFocusPainted(false);
        loginBtn.setFont(new Font("Verdana", Font.BOLD, 14));
        panel.add(loginBtn);

        loginBtn.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            User user = LibraryDatabase.validateLogin(username, password);
            if (user != null) {
                JOptionPane.showMessageDialog(this, "Login successful as " + user.getRole());

                if (user.getRole().equalsIgnoreCase("admin")) {
                    new AdminDashboard(user);
                } else {
                    new UserDashboard(user);
                }

                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            }
        });

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
