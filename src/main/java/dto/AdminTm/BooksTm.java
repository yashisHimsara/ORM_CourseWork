package dto.AdminTm;

import java.awt.*;

public class BooksTm {
    private String id;
    private String title;
    private String author;
    private String catougery;
    private String status;
    private Button remove;

    public BooksTm() {
    }

    public BooksTm(String id, String title, String author, String catougery, String status, Button remove) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.catougery = catougery;
        this.status = status;
        this.remove = remove;
    }

    @Override
    public String toString() {
        return "BooksTm{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", catougery='" + catougery + '\'' +
                ", status='" + status + '\'' +
                ", remove=" + remove +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCatougery() {
        return catougery;
    }

    public void setCatougery(String catougery) {
        this.catougery = catougery;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Button getRemove() {
        return remove;
    }

    public void setRemove(Button remove) {
        this.remove = remove;
    }
}
