package ktpm.baitap.Library.StrategyPattern;

public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void displayInfo() {
        System.out.println("📚 " + title + " - " + author + " (" + genre + ")");
    }
}
