package me.steven.ezclub.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
@Table(name = "province")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "cn_name", nullable = false, unique = true)
    private String cnName;

    @Column(name = "en_name", nullable = false)
    private String enName;

    @JsonIgnore
    @OneToMany(mappedBy = "province", fetch = FetchType.LAZY)
    private List<City> cities;

    public Province() {}

    public Province(String id, String cnName, String enName) {
        this.cnName = cnName;
        this.enName = enName;
    }

    @Override
    public String toString() {
        return String.format(
                "Province [id='%s', cnName='%s', enName='%s', citiesSize=%d]",
                id, cnName, enName, cities.size()
        );
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    public List<City> getCities() {
        return cities;
    }

}
