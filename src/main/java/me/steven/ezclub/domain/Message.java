package me.steven.ezclub.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "message", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "content", nullable = false, updatable = false)
    private String content;

    @Column(name = "is_read")
    private Boolean read;

    @Column(name = "sent_time")
    private Timestamp sentTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id", nullable = false, updatable = false)
    private User sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressee_id", nullable = false, updatable = false)
    private User addressee;

    public Message() {}

    public Message(String content, User sender, User addressee) {
        this.content = content;
        this.read = false;
        this.sentTime = new Timestamp(System.currentTimeMillis());
        this.sender = sender;
        this.addressee = addressee;
    }

    @Override
    public String toString() {
        return String.format(
                "Message [id=%d, content='%s', read=%b, sentTime=%tc%n, sender='%s', addressee='%s']",
                id, content.substring(0, 20), read, sentTime, sender.getName(), addressee.getName()
        );
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public Boolean getRead() {
        return read;
    }
    public void setRead(Boolean read) {
        this.read = read;
    }
    public Timestamp getSentTime() {
        return sentTime;
    }
    public User getSender() {
        return sender;
    }
    public User getAddressee() {
        return addressee;
    }

}
