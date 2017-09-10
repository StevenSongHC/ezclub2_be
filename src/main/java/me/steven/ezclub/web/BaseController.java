package me.steven.ezclub.web;

import me.steven.ezclub.domain.City;
import me.steven.ezclub.service.CityService;
import me.steven.ezclub.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class BaseController {

    @Autowired
    private ProvinceService pvSvs;
    @Autowired
    private CityService ctSvs;

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("testdb")
    @ResponseBody
    public City testDB() {
        return ctSvs.getCityById(520);
    }

}
