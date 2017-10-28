package me.steven.ezclub.domain;

import com.google.gson.Gson;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "club_member", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class ClubMember {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nickname", updatable = false)
    private String nickname;

    @Column(name = "realname")
    private String realname;

    @Column(name = "contact")
    private String contact;

    @Column(name = "join_date", updatable = false)
    private Date joinDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false, updatable = false)
    private Department department;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", nullable = false, updatable = false)
    private Class classOfYear;

    /*@JsonIgnore
    @OneToOne(mappedBy = "creator")
    private Club createClub;

    @JsonIgnore
    @OneToOne(mappedBy = "president")
    private Club manageClub;*/

    public ClubMember() {}

    public ClubMember(String nickname, User user, Department department, Class classOfYear) {
        this.nickname = user.getName();
        this.realname = nickname;
        this.user = user;
        this.department = department;
        this.classOfYear = classOfYear;
        this.joinDate = new Date(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNickname() {
        return nickname;
    }
    public String getRealname() {
        return realname;
    }
    public void setRealname(String realname) {
        this.realname = realname;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public User getUser() {
        return user;
    }
    public Department getDepartment() {
        return department;
    }
    public Class getClassOfYear() {
        return classOfYear;
    }

}
