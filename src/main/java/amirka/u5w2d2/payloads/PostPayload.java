package amirka.u5w2d2.payloads;

public class PostPayload {
    private String category;
    private String title;
    private String content;

    public PostPayload() {
    }

    public PostPayload(String category, String title, String content) {
        this.category = category;
        this.title = title;
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "PostPayload{" +
                "category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
