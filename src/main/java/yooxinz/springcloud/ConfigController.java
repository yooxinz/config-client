package yooxinz.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by star on 2018/8/17.
 */
@RestController
public class ConfigController {

    @Value("${from}")
    private  String from;

    @RequestMapping(value = "/hi")
    public String hi(){
        return from;
    }
}
