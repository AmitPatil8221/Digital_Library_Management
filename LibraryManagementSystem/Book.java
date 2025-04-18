package LibraryManagementSystem;

public class Book {
    private final String id;
    private final String title;
    private final String author;
    private boolean isIssued;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return isIssued; }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return id + " - " + title + " by " + author + (isIssued ? " [Issued]" : " [Available]");
    }
}
