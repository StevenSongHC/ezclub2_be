package me.steven.ezclub.web;

import me.steven.ezclub.dto.ResponseData;
import me.steven.ezclub.dto.parameter.UserRegistration;
import me.steven.ezclub.service.CityService;
import me.steven.ezclub.service.CollegeService;
import me.steven.ezclub.service.ProvinceService;
import me.steven.ezclub.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("")
public class BaseController {

    private final UserService uSvs;
    private final ProvinceService pvSvs;
    private final CityService ctSvs;
    private final CollegeService clgSvs;

    private final static Logger log = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    public BaseController(
            UserService uSvs,
            ProvinceService pvSvs,
            CityService ctSvs,
            CollegeService clgSvs) {
        this.uSvs = uSvs;
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
        if (uSvs.save(registration) == null) {
            result.setSuccess(false);
            result.setMsg("未能成功注册用户信息");
        }
        return result;
    }

}
