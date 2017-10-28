package me.steven.ezclub.domain;

import me.steven.ezclub.misc.enumeration.ContentType;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "content", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "submit_time")
    private Timestamp submitTime;

    @Column(name = "order")
    private Integer order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_id", nullable = false, updatable = false)
    private Activity activity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submitter_id", nullable = false, updatable = false)
    private ClubMember submitter;

    public Content() {}

    public Content(ContentType type, String content, Integer order, Activity activity, ClubMember submitter) {
        this.type = type.getValue();
        this.content = content;
        this.order = order;
        this.activity = activity;
        this.submitter = submitter;
        this.submitTime = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return String.format(
                "Content [id=%d, type=%d, content='%s', order=%d, activity='%s', submitter='%s' submitTime=%tc%n]",
                id, type, content.substring(0, 20), order, activity.getSummary(), submitter.getNickname(), submitTime
        );
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getType() {
        return type;
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
    public Integer getOrder() {
        return order;
    }
    public void setOrder(Integer order) {
        this.order = order;
    }
    public Activity getActivity() {
        return activity;
    }
    public ClubMember getSubmitter() {
        return submitter;
    }

}
