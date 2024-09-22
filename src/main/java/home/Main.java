package home;

import java.util.stream.Collectors;
import home.book.Book;
import home.chapter.Chapter;
import home.configs.BookConfiguration;
import home.configs.ChapterConfiguration;
import home.title.Title;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try ( AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            BookConfiguration.class, ChapterConfiguration.class, Title.class
        )) {
            Book book = context.getBean(Book.class);
            System.out.println("book title: " + book.getBookTitle().getTitleValue());
            System.out.println("book author: " + book.getAuthor());
            System.out.println("book chapter list: " + book.getChapterList().stream().map(Chapter::toString).collect(
                Collectors.joining(",")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
