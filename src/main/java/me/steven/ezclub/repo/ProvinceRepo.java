package me.steven.ezclub.repo;

import me.steven.ezclub.domain.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinceRepo extends JpaRepository<Province, String> {

    /*List<Province> findAll();

    Province findById(String id);*/

}
