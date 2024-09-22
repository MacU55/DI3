package home.configs;

import home.title.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:titles.properties")
public class TitleConfiguration {
    @Autowired
    Environment environment;

    @Bean
    public Title chapter1Title(){
        return new Title(environment.getProperty("myFirstSpring.chapter1.title"));
    }

    @Bean
    public Title chapter2Title(){
        return new Title(environment.getProperty("myFirstSpring.chapter2.title"));
    }

    @Bean
    public Title bookTitle(){
        Title title = new Title();
        title.setTitleValue(environment.getProperty("myFirstSpringBookTitle"));
        return title;
    }


}
