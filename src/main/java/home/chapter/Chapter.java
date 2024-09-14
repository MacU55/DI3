package home.chapter;

import home.title.Title;

public class Chapter {
    private int number;
    private Title chapterTitle;
    private String content;

    public Chapter() {
    }

    public Chapter(int number, Title chapterTitle, String content) {
        this.number = number;
        this.chapterTitle = chapterTitle;
        this.content = content;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Title getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(Title chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
