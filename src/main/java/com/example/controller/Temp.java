package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2021/9/12 17:25 星期日
 * @Description:
 */
@RestController
public class Temp {
    @RequestMapping("/a")
    public String a(){
        return "ujhj";
    }

}
