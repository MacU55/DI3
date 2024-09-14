package home.book;

import java.util.List;
import home.chapter.Chapter;
import home.title.Title;

public class Book {
    private String isbnValue;
    private Title bookTitle;
    private String author;
    private List<Chapter> chapterList;

    public Book(String isbnValue, Title bookTitle, String author, List<Chapter> chapterList) {
        this.isbnValue = isbnValue;
        this.bookTitle = bookTitle;
        this.author = author;
        this.chapterList = chapterList;
    }

    public Book() {
    }

    public String getIsbnValue() {
        return isbnValue;
    }

    public void setIsbnValue(String isbnValue) {
        this.isbnValue = isbnValue;
    }

    public Title getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(Title bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }
}
