package me.steven.ezclub.domain;

import com.google.gson.Gson;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "college_album", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class CollegeAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "path", nullable = false, updatable = false)
    private String path;

    @Column(name = "describe")
    private String describe;

    @Column(name = "upload_date", updatable = false)
    private Date uploadDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "college_id", nullable = false, updatable = false)
    private College college;

    public CollegeAlbum() {}

    public CollegeAlbum(String path, String describe, College college) {
        this.path = path;
        this.describe = describe;
        this.uploadDate = new Date(System.currentTimeMillis());
        this.college = college;
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
    public String getPath() {
        return path;
    }
    public String getDescribe() {
        return describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public Date getUploadDate() {
        return uploadDate;
    }
    public College getCollege() {
        return college;
    }

}
