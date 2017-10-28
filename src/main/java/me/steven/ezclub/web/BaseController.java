package me.steven.ezclub.web;

import me.steven.ezclub.domain.Province;
import me.steven.ezclub.service.CityService;
import me.steven.ezclub.service.CollegeService;
import me.steven.ezclub.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class BaseController {

    private final ProvinceService pvSvs;
    private final CityService ctSvs;
    private final CollegeService clgSvs;

    @Autowired
    public BaseController(ProvinceService pvSvs, CityService ctSvs, CollegeService clgSvs) {
        this.pvSvs = pvSvs;
        this.ctSvs = ctSvs;
        this.clgSvs = clgSvs;
    }

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("testdb")
    public List<Province> testDB() {
        String[] a = new String[]{"a", "b"};
        System.out.println(a[3]);
        return pvSvs.listProvinces();
    }

}
