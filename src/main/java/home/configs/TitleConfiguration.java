package home.configs;

import home.title.Title;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TitleConfiguration {

    @Bean
    public Title chapter1Title(){
        return new Title("Spring framework - Chapter 1");
    }

    @Bean
    public Title chapter2Title(){
        return new Title("Spring framework - Chapter 2");
    }

    @Bean
    public Title bookTitle(){
        Title title = new Title();
        title.setTitleValue("Book of Spring");
        return title;
    }


}
