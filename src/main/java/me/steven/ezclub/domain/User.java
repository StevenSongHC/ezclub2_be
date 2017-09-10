package me.steven.ezclub.domain;

//import me.steven.ezclub.misc.enumeration.Status;
//import me.steven.ezclub.misc.enumeration.Gender;
//
//import javax.persistence.*;
//import java.sql.Date;
//import java.sql.Timestamp;
//
//@Entity
//@Table(name = "user")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private Long id;
//
//    @Column(name = "name", unique = true, updatable = false, nullable = false)
//    private String name;
//
//    @Column(name = "email", unique = true, nullable = false)
//    private String email;
//
//    @Column(name = "password", nullable = false)
//    private String password;
//
//    @Column(name = "portrait")
//    private String portrait;
//
//    @Column(name = "gender")
//    private Integer gender;
//
//    @Column(name = "birth_date")
//    private Date birthDate;
//
//    @Column(name = "join_date", updatable = false)
//    private Date joinDate;
//
//    @Column(name = "last_login")
//    private Timestamp lastLoginTime;
//
//    @Column(name = "status")
//    private Integer accountStatus;
//
//    public User() {}
//
//    public User(String name, String email, String password) {
//        long currentTime = System.currentTimeMillis();
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.portrait = "images/portrait/default.png";
//        this.gender = Gender.SECRET.getValue();
//        this.birthDate = Date.valueOf("1900-01-01");
//        this.joinDate = new Date(currentTime);
//        this.lastLoginTime = new Timestamp(currentTime);
//        this.accountStatus = Status.NORMAL.getValue();
//    }
//
//    @Override
//    public String toString() {
//        return String.format(
//                "User [id=%d, name='%s', email='%s' ,portrait='%s' ,gender=%d, birthDate='%s', joinDate='%s', " +
//                        "lastLoginTime='%s', accountStatus=%d]",
//                id, name, email, portrait, gender, birthDate.toString(), joinDate.toString(), lastLoginTime.toString(),
//                accountStatus
//        );
//    }
//
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getPortrait() {
//        return portrait;
//    }
//    public void setPortrait(String portrait) {
//        this.portrait = portrait;
//    }
//    public Integer getGender() {
//        return gender;
//    }
//    public void setGender(Integer gender) {
//        this.gender = gender;
//    }
//    public Date getBirthDate() {
//        return birthDate;
//    }
//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }
//    public Date getJoinDate() {
//        return joinDate;
//    }
//    public Timestamp getLastLoginTime() {
//        return lastLoginTime;
//    }
//    public void setLastLoginTime(Timestamp lastLoginTime) {
//        this.lastLoginTime = lastLoginTime;
//    }
//    public Integer getAccountStatus() {
//        return accountStatus;
//    }
//    public void setAccountStatus(Integer accountStatus) {
//        this.accountStatus = accountStatus;
//    }
//
//}
//