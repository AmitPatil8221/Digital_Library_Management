package LibraryManagementSystem;

/*

DIGITAL LIBRARY MANAGEMENT

1. The main objective of this project is to provide a complete automated Library by digitizing its
each and every functionality. Starting from the bookkeeping, issuing of books, fine
generation, advance booking and report generation all will be accomplished under one single
project. The project will be a web-based project with a database server responsible for
maintaining every single detail of the Library. It has a very user-friendly interface which can
easily be operated by any non-technical person.

 There are essentially two modules of this software;

1. Admin module: Admin will have complete control over the system. Admin has permissions to
update, delete or modify any existing record or make a new entry (books and members).

2. Users: The normal users enjoy only limited privileges. They have view access to the books.
They can browse through the categories, search for a particular book, return and issue a
book. They are also provided with an email option in case of a query.

*/
public class Main {
    public static void main(String[] args) {
        new LoginPage(); // Launch Login
    }
}
