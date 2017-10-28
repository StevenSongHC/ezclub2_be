package me.steven.ezclub.domain;

import me.steven.ezclub.misc.enumeration.Status;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comment", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "content", nullable = false, updatable = false)
    private String content;

    @Column(name = "submit_time")
    private Timestamp submitTime;

    @Column(name = "status")
    private Integer status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_id", nullable = false, updatable = false)
    private Activity activity;

    public Comment() {}

    public Comment(String content, User user, Activity activity) {
        this.content = content;
        this.submitTime = new Timestamp(System.currentTimeMillis());
        this.user = user;
        this.activity = activity;
        this.status = Status.UNCHECKED.getValue();
    }

    @Override
    public String toString() {
        return String.format(
                "Comment [id=%d, content='%s', submitTime=%tc%n, user='%s', activity='%s', commentStatus=%d]",
                id, content.substring(0, 20), submitTime, user.getName(), activity.getSummary(), status
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
    public void setContent(String content) {
        this.content = content;
    }
    public Timestamp getSubmitTime() {
        return submitTime;
    }
    public void setSubmitTime(Timestamp submitTime) {
        this.submitTime = submitTime;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public User getUser() {
        return user;
    }
    public Activity getActivity() {
        return activity;
    }

}
