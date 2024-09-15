package home.configs;

import java.util.ArrayList;
import java.util.List;
import home.book.Book;
import home.chapter.Chapter;
import home.title.Title;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration public class BeansConfiguration {

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
