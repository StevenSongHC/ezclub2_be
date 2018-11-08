package me.steven.ezclub.web;

import me.steven.ezclub.dto.ResponseData;
import me.steven.ezclub.dto.parameter.UserRegistration;
import me.steven.ezclub.service.CityService;
import me.steven.ezclub.service.CollegeService;
import me.steven.ezclub.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
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
    public ResponseData index() {
        ResponseData result = new ResponseData();
        result.setMsg("Hello! 你好");
        return result;
    }

    @GetMapping("test")
    public ResponseData test() {
        ResponseData result = new ResponseData();
        result.setMsg("BE server connected");
        result.setData(pvSvs.listProvinces());
        return result;
    }

    @PostMapping("submitRegister")
    public ResponseData submitRegister(@RequestBody UserRegistration registration) {
        ResponseData result = new ResponseData();
        System.out.println("email " + registration.getEmail());
        System.out.println("nickname " + registration.getNickname());
        System.out.println("password " + registration.getPassword());
        return result;
    }

}
