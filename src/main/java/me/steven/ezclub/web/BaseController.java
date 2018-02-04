package me.steven.ezclub.web;

import me.steven.ezclub.dto.ResponseData;
import me.steven.ezclub.service.CityService;
import me.steven.ezclub.service.CollegeService;
import me.steven.ezclub.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BaseController {

    private final ProvinceService pvSvs;
    private final CityService ctSvs;
    private final CollegeService clgSvs;

    private ResponseData result = new ResponseData();

    @Autowired
    public BaseController(ProvinceService pvSvs, CityService ctSvs, CollegeService clgSvs) {
        this.pvSvs = pvSvs;
        this.ctSvs = ctSvs;
        this.clgSvs = clgSvs;
    }

    @GetMapping
    public ResponseData index() {
        result.setMsg("Hello! 你好");
        return result;
    }

    @GetMapping("test")
    public ResponseData testDB() {
        result.setMsg("BE server connected");
        result.setData(pvSvs.listProvinces());
        return result;
    }

}
