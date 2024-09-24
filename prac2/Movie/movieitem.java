package Movie;

public class MovieItem {
    private String title;
    private String author;

    // Protected constructor to initialize both title and author
    protected MovieItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Public method to get the title
    public String getTitle() {
        return title;
    }

    // Public method to get the author
    public String getAuthor() {
        return author;
    }

    // Default method to print details (accessible within the same package)
    void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
