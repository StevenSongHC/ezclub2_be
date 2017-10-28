package me.steven.ezclub.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "department", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "create_date", updatable = false)
    private Date createDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id", nullable = false, updatable = false)
    private Club club;

    public Department() {}

    public Department(String title, Club club) {
        this.title = title;
        this.club = club;
        this.createDate = new Date(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return String.format(
                "Department [id=%d, title='%s', createDate=%tF%n, club='%s']",
                id, title, createDate, club.getName()
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
    public Date getCreateDate() {
        return createDate;
    }
    public Club getClub() {
        return club;
    }

}
