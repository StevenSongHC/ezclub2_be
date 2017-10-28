package me.steven.ezclub.service;

import me.steven.ezclub.domain.Province;
import me.steven.ezclub.repo.ProvinceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProvinceService {

    private final ProvinceRepo provinceRepo;

    @Autowired
    public ProvinceService(ProvinceRepo provinceRepo) {
        this.provinceRepo = provinceRepo;
    }

    public List<Province> listProvinces() {
        return provinceRepo.findAll();
    }

    public Province getProvinceById(String id) {
        return provinceRepo.findOne(id);
    }

}
