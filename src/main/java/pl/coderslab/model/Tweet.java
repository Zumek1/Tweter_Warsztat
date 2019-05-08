package pl.coderslab.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tweet")
public class Tweet {

    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    private String text;
    private LocalDateTime created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @PrePersist
    public void prePersist() {
        created = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", created=" + created +
                '}';
    }
}
