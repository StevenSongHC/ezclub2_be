package me.steven.ezclub.domain;

//import me.steven.ezclub.misc.enumeration.Status;
//
//import javax.persistence.*;
//import java.sql.Date;
//
//@Entity
//@Table(name = "club")
//public class Club {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private Long id;
//
//    @Column(name = "name", nullable = false)
//    private String name;
//
//    @Column(name = "profile_name", nullable = false)
//    private String profileName;
//
//    @Column(name = "slogan")
//    private String slogan;
//
//    @Column(name = "intro", insertable = false)
//    private String intro;
//
//    @Column(name = "logo")
//    private String logo;
//
//    @Column(name = "create_date", updatable = false)
//    private Date createDate;
//
//    @Column(name = "status")
//    private Integer status;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "creator_uid")
//    private User creator;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "president_uid")
//    private User president;
//
//    public Club() {}
//
//    public Club(String name, String profileName,String slogan, User creator) {
//        this.name = name;
//        this.profileName = profileName;
//        this.slogan = slogan;
//        this.logo = "images/club-logo/default.png";
//        this.createDate = new Date(System.currentTimeMillis());
//        this.creator = creator;
//        this.president = creator;
//        this.status = Status.UNCHECKED.getValue();
//    }
//
//    @Override
//    public String toString() {
//        return String.format(
//                "Club [id=%d, name='%s', profileName='%s', slogan='%s', logo='%s', createDate='%s', creator='%s', " +
//                        "president='%s', status=%d]",
//                id, name, profileName, slogan, logo, createDate.toString(), creator.getName(), president.getName(),
//                status
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
//    public String getProfileName() {
//        return profileName;
//    }
//    public void setProfileName(String profileName) {
//        this.profileName = profileName;
//    }
//    public String getSlogan() {
//        return slogan;
//    }
//    public void setSlogan(String slogan) {
//        this.slogan = slogan;
//    }
//    public String getIntro() {
//        return intro;
//    }
//    public void setIntro(String intro) {
//        this.intro = intro;
//    }
//    public String getLogo() {
//        return logo;
//    }
//    public void setLogo(String logo) {
//        this.logo = logo;
//    }
//    public Date getCreateDate() {
//        return createDate;
//    }
//    public User getCreator() {
//        return creator;
//    }
//    public void setCreator(User creator) {
//        this.creator = creator;
//    }
//    public User getPresident() {
//        return president;
//    }
//    public void setPresident(User president) {
//        this.president = president;
//    }
//    public Integer getStatus() {
//        return status;
//    }
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//}
//