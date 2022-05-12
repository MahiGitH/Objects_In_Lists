import java.util.Date;

public class Book {
    private String bookTitle;
    private int bookNumOfPages;
    private int bookPublishYear;

    public Book(String bookTitle, int bookNumOfPages, int bookPublishYear){
        this.bookTitle = bookTitle;
        this.bookNumOfPages = bookNumOfPages;
        this.bookPublishYear =bookPublishYear;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookNumOfPages() {
        return bookNumOfPages;
    }

    public int getBookPublishYear() {
        return bookPublishYear;
    }
    @Override
    public String toString() {
        return getBookTitle() + ", " + getBookNumOfPages() + " pages, " + getBookPublishYear();
    }
}
