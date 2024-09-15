package home.configs;

import java.util.ArrayList;
import java.util.List;
import home.book.Book;
import home.chapter.Chapter;
import home.title.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(ChapterConfiguration.class)
@Configuration
public class BookConfiguration {
    @Autowired
    private Title bookTitle;
    @Autowired
    private Chapter chapter1;
    @Autowired
    private Chapter chapter2;

    @Bean
    public Book firstSpringBook() {
        Book firstSpringBook = new Book();
        firstSpringBook.setIsbnValue("ISBN1");
        firstSpringBook.setBookTitle(bookTitle);
        firstSpringBook.setAuthor("Mr. John");
        List<Chapter> chapterList = new ArrayList<>();
        chapterList.add(chapter1);
        chapterList.add(chapter2);
        firstSpringBook.setChapterList(chapterList);
        return firstSpringBook;
    }

}
