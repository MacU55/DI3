package home.configs;

import home.chapter.Chapter;
import home.title.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(TitleConfiguration.class)
@Configuration
public class ChapterConfiguration {
    @Autowired
    Title chapter1Title;
    @Autowired
    Title chapter2Title;

    @Bean
    public Chapter chapter1() {
        Chapter chapter1 = new Chapter();
        chapter1.setNumber(1);
        chapter1.setChapterTitle(chapter1Title);
        chapter1.setContent("The content of chapter 1 goes here.");
        return chapter1;
    }

    @Bean
    public Chapter chapter2() {
        return new Chapter(2, chapter2Title, "The content of chapter 2 goes here.");
    }
}
