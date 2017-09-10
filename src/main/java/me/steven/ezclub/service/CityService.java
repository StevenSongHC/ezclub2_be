package me.steven.ezclub.service;

import me.steven.ezclub.domain.City;
import me.steven.ezclub.repo.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {

    @Autowired
    private CityRepo cityRepo;

    @Transactional
    public City save(City city) {
        return cityRepo.save(city);
    }

    public List<City> listCities() {
        return cityRepo.findAll();
    }

    public City getCityById(Integer id) {
        return cityRepo.findOne(id);
    }

}
