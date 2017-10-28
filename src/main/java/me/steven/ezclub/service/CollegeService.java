package me.steven.ezclub.service;

import me.steven.ezclub.domain.College;
import me.steven.ezclub.repo.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CollegeService {

    private final CollegeRepo collegeRepo;

    @Autowired
    public CollegeService(CollegeRepo collegeRepo) {
        this.collegeRepo = collegeRepo;
    }

    @Transactional
    public College save(College college) {
        return collegeRepo.save(college);
    }

    public List<College> listColleges() {
        return collegeRepo.findAll();
    }

}
