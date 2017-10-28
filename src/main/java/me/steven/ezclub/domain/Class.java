package me.steven.ezclub.domain;

import javax.persistence.*;

@Entity
@Table(name = "class", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "year", nullable = false, updatable = false)
    private int year;

    @Column(name = "group_photo")
    private String groupPhoto;

    @Column(name = "freshman_photo")
    private String freshmanPhoto;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id", nullable = false, updatable = false)
    private Club club;

    public Class() {}

    public Class(int year, Club club) {
        this.year = year;
        this.club = club;
    }

    @Override
    public String toString() {
        return String.format(
                "Class [id=%d, year=%d, groupPhoto='%s', freshmanPhoto='%s', club='%s']",
                id, year, groupPhoto, freshmanPhoto, club.getName()
        );
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getYear() {
        return year;
    }
    public String getGroupPhoto() {
        return groupPhoto;
    }
    public void setGroupPhoto(String groupPhoto) {
        this.groupPhoto = groupPhoto;
    }
    public String getFreshmanPhoto() {
        return freshmanPhoto;
    }
    public void setFreshmanPhoto(String freshmanPhoto) {
        this.freshmanPhoto = freshmanPhoto;
    }
    public Club getClub() {
        return club;
    }

}
