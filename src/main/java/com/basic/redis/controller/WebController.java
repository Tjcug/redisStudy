package com.basic.redis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * locate com.basic.redis.controller
 * Created by 79875 on 2017/5/6.
 */
@Controller
public class WebController  extends BaseController{
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
