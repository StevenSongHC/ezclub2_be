package me.steven.ezclub.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.steven.ezclub.misc.enumeration.Status;
import me.steven.ezclub.misc.enumeration.Gender;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"user\"", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "name"),
        @UniqueConstraint(columnNames = "email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", updatable = false, nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "portrait")
    private String portrait;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "join_date", updatable = false)
    private Date joinDate;

    @Column(name = "last_login")
    private Timestamp lastLoginTime;

    @Column(name = "status")
    private Integer status;

    @OneToOne
    @JoinColumn(name = "from_city_id")
    private City fromCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id")
    private College college;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "user_tag",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
    private Set<Tag> tags;

    public User() {}

    public User(String name, String email, String password) {
        long currentTime = System.currentTimeMillis();
        this.name = name;
        this.email = email;
        this.password = password;
        this.portrait = "images/portrait/default.png";
        this.gender = Gender.SECRET.getValue();
        this.birthDate = Date.valueOf("1900-01-01");
        this.joinDate = new Date(currentTime);
        this.lastLoginTime = new Timestamp(currentTime);
        this.status = Status.NORMAL.getValue();
    }

    @Override
    public String toString() {
        return String.format(
                "User [id=%d, name='%s', email='%s' ,portrait='%s' ,gender=%d, birthDate=%tF%n, joinDate=%tF%n, " +
                        "lastLoginTime=%tc%n, accountStatus=%d]",
                id, name, email, portrait, gender, birthDate, joinDate, lastLoginTime, status
        );
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPortrait() {
        return portrait;
    }
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }
    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public City getFromCity() {
        return fromCity;
    }
    public void setFromCity(City fromCity) {
        this.fromCity = fromCity;
    }
    public College getCollege() {
        return college;
    }
    public void setCollege(College college) {
        this.college = college;
    }
    public Set<Tag> getTags() {
        if (this.tags == null) {
            tags = new LinkedHashSet<>();
        }
        return tags;
    }

}
