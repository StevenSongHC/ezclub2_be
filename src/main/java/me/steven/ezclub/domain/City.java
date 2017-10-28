package me.steven.ezclub.domain;

import javax.persistence.*;

@Entity
//@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Table(name = "city", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "cn_name")
})
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cn_name", nullable = false)
    private String cnName;

    @Column(name = "en_name", nullable = false)
    private String enName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "province_id")
    private Province province;

    /*@JsonIgnore
    @OneToOne(mappedBy = "fromCity")
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "city")
    private Set<College> colleges;*/

    public City() {}

    public City(String cnName, String enName, Province province) {
        this.cnName = cnName;
        this.enName = enName;
        this.province = province;
    }

    @Override
    public String toString() {
        return String.format(
                "City [id=%d, cnName='%s', enName='%s', provinceId='%s']",
                id, cnName, enName, province.getId()
        );
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCnName() {
        return cnName;
    }
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }
    public String getEnName() {
        return enName;
    }
    public void setEnName(String enName) {
        this.enName = enName;
    }
    public Province getProvince() {
        return province;
    }
    public void setProvince(Province province) {
        this.province = province;
    }

}
