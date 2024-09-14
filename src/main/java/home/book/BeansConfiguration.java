package home.book;

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

}
