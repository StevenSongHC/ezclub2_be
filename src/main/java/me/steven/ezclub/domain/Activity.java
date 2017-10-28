package me.steven.ezclub.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "activity", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "summary")
    private String summary;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "is_finished")
    private Boolean finished;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id", nullable = false, updatable = false)
    private Club club;

    public Activity() {}

    public Activity(String title, String summary, Club club) {
        this.title = title;
        this.summary = summary;
        this.club = club;
        this.updateDate = new Date(System.currentTimeMillis());
        this.finished = false;
    }

    @Override
    public String toString() {
        return String.format(
                "Activity [id=%d, title='%s', summary='%s', club='%s', updateDate=%tF%n, finished=%b]",
                id, title, summary.substring(0, 20), club.getName(), updateDate, finished
        );
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public Boolean getFinished() {
        return finished;
    }
    public void setFinished(Boolean finished) {
        this.finished = finished;
    }
    public Club getClub() {
        return club;
    }

}
