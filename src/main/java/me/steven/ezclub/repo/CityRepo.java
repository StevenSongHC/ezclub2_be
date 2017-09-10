package me.steven.ezclub.repo;

import me.steven.ezclub.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepo extends JpaRepository<City, Integer> {

    /*City save(City city);

    List<City> findAll();

    City findById(Integer id);*/

}
