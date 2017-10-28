package me.steven.ezclub.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "subscription", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "subscribe_time", updatable = false)
    private Timestamp subscribeTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id", nullable = false, updatable = false)
    private Club club;

    public Subscription() {}

    public Subscription(User user, Club club) {
        this.subscribeTime = new Timestamp(System.currentTimeMillis());
        this.user = user;
        this.club = club;
    }

    @Override
    public String toString() {
        return String.format(
                "Subscription [id=%d, subscribeTime=%tc%n, user='%s', club='%s']",
                id, subscribeTime, user.getName(), club.getName()
        );
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Timestamp getSubscribeTime() {
        return subscribeTime;
    }

    public User getUser() {
        return user;
    }
    public Club getClub() {
        return club;
    }

}
