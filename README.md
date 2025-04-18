# Digital Library Management System

A comprehensive digital library management system with admin and user modules, built using Java Swing.

## Features

### Admin Module
- Add new books to the library
- Delete existing books
- View all books in the library
- Manage user accounts

### User Module
- View available books
- Issue books
- Return books
- Submit queries to admin

## Technologies Used
- Java 17
- Java Swing for GUI
- Custom fonts for enhanced UI
- Object-oriented design principles

## Installation

1. **Prerequisites**:
   - Java JDK 17 or later
   - Maven (for dependency management)

2. **Clone the repository**:
   ```bash
   git clone https://github.com/AmitPatil8221/Digital_Library_Management.git

3. **Run the application**:
   ```bash
   cd Digital_Library_Management
   java -cp "target/classes" Digital_Library_Management.Main

## Usage

### Login Credentials
- **Admin Access**:
  - Username: `admin`
  - Password: `admin@123`
- **Regular User**:
  - Username: `Amit8221`
  - Password: `Patil@8221`

### Admin Functions
1. **Add Book**:
   - Click "Add Book" button
   - Enter Book ID, Title, and Author
   - Submit to add to library

2. **Delete Book**:
   - Click "Delete Book" button
   - Enter Book ID to remove
   - Confirm deletion

3. **View All Books**:
   - Click "View All Books"
   - Shows complete library inventory
   - Displays availability status

### User Functions
1. **Browse Books**:
   - Click "View Books"
   - See all available books
   - Filter by availability

2. **Issue Book**:
   - Click "Issue Book"
   - Enter Book ID
   - System marks book as issued

3. **Return Book**:
   - Click "Return Book"
   - Enter Book ID
   - System updates availability

4. **Submit Query**:
   - Click "Send Query"
   - Type your question/concern
   - Admin receives notification

## Project Structure

DigitalLibraryManagement/
├── AdminDashboard.java        # Admin interface
├── Book.java                  # Book entity
├── IssueBook.java             # Book issuing functionality
├── LibraryDatabase.java       # In-memory database
├── LoginPage.java             # Login interface
├── Main.java                  # Entry point
├── QueryForm.java             # Query handling
├── User.java                  # User entity
└── UserDashboard.java         # User interface

## 🧑‍💻 Author

Amit Patil  
amitvpatil8221@gmail.com  
https://github.com/AmitPatil8221  

## 📄 License

This project is licensed under the MIT License. You are free to use, modify, and share it for learning or development purposes.
