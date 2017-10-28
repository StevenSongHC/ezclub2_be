package me.steven.ezclub.domain;

import me.steven.ezclub.misc.enumeration.Status;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "college", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "primary_name")
})
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "primary_name", nullable = false)
    private String primaryName;

    @Column(name = "secondary_name")
    private String secondaryName;

    @Column(name = "intro")
    private String intro;

    @Column(name = "emblem")
    private String emblem;

    @Column(name = "create_date", updatable = false)
    private Date createDate;

    @Column(name = "status")
    private Integer status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", updatable = false)
    private City city;

    /*@JsonIgnore
    @OneToMany(mappedBy = "college")
    private Set<CollegeAlbum> albums;

    @JsonIgnore
    @OneToMany(mappedBy = "college")
    private Set<User> students;*/

    public College() {}

    public College(String primaryName, String secondaryName, String intro, City city) {
        this.primaryName = primaryName;
        this.secondaryName = secondaryName;
        this.intro = intro;
        this.city = city;
        this.emblem = "images/college-emblem/default.png";
        this.createDate = new Date(System.currentTimeMillis());
        this.status = Status.UNCHECKED.getValue();
    }

    @Override
    public String toString() {
        return String.format(
                "College [id=%d, primaryName='%s', secondaryName='%s', createDate=%tF%n, status=%d, city='%s']",
                id, primaryName, secondaryName, createDate, status, city.getEnName()
        );
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPrimaryName() {
        return primaryName;
    }
    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }
    public String getSecondaryName() {
        return secondaryName;
    }
    public void setSecondaryName(String secondaryName) {
        this.secondaryName = secondaryName;
    }
    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public String getEmblem() {
        return emblem;
    }
    public void setEmblem(String emblem) {
        this.emblem = emblem;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public City getCity() {
        return city;
    }

}
