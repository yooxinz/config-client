package yooxinz.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yooxinz.springcloud.service.UserService;

/**
 * Created by star on 2018/8/17.
 */
@RestController
public class ConfigController{

    @Autowired
    UserService userSerivce;

    @Value("${spring.datasource.driver-class-name}")
    private  String from;

    @RequestMapping("/")
    @ResponseBody
    public String index(){

        return userSerivce.getUserNameById(1).getName();
    }

    @RequestMapping(value = "/hi")
    public String hi(){
        return from;
    }
}
