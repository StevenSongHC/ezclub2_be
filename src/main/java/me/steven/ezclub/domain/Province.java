package me.steven.ezclub.domain;

import javax.persistence.*;

@Entity
@Table(name = "province", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "cn_name")
})
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @Column(name = "cn_name", nullable = false)
    private String cnName;

    @Column(name = "en_name", nullable = false)
    private String enName;

    /*@JsonIgnore
    @OneToMany(mappedBy = "province")
    private Set<City> cities;*/

    public Province() {}

    public Province(String id, String cnName, String enName) {
        this.id = id;
        this.cnName = cnName;
        this.enName = enName;
    }

    @Override
    public String toString() {
        return String.format(
                "Province [id='%s', cnName='%s', enName='%s']",
                id, cnName, enName
        );
    }

    public String getId() {
        return id;
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

}
