package amirka.u5w2d2.entities;

import java.util.Random;

public class Post {
    private long id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readingTime;

    public Post(String category, String title, String content) {
        Random rnd = new Random();
        this.id = rnd.nextInt(1, 100000);
        this.category = category;
        this.title = title;
        this.cover = "https://picsum.photos/200/300";
        this.content = content;
        this.readingTime = rnd.nextInt(1, 59);
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReadingTime() {
        return readingTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", content='" + content + '\'' +
                ", readingTime=" + readingTime +
                '}';
    }
}
