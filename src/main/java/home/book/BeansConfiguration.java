package home.book;

import java.util.ArrayList;
import java.util.List;
import home.chapter.Chapter;
import home.title.Title;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration public class BeansConfiguration {

    @Bean
    public Title bookTitle(){
        Title bookTitle = new Title();
        bookTitle.setTitleValue("Book of Spring");
        return bookTitle;
    }

    @Bean
    public Title chapter1Title(){
        return new Title("Spring framework - Chapter 1");
    }

    @Bean
    public Title chapter2Title(){
        return new Title("Spring framework - Chapter 2");
    }

    @Bean
    public Chapter chapter1(){
        Chapter chapter1 = new Chapter();
        chapter1.setNumber(1);
        chapter1.setChapterTitle(chapter1Title());
        chapter1.setContent("The content of chapter 1 goes here.");
        return chapter1;
    }

    @Bean
    public Chapter chapter2(){
        return new Chapter(2, chapter2Title(), "The content of chapter 1 goes here.");
    }

    @Bean
    public Book springBook(){
        Book springBook = new Book();
        springBook.setIsbnValue("ISBN1");
        springBook.setBookTitle(bookTitle());
        springBook.setAuthor("Author John");
        List<Chapter> chapterList = new ArrayList<>();
        chapterList.add(chapter1());
        chapterList.add(chapter2());
        springBook.setChapterList(chapterList);
        return springBook;
    }

}
