package com.example.controller;

import com.example.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2021/9/12 17:25 星期日
 * @Description:
 */
@RestController
public class TestController {
//    @Value("${user.uname}")
//    private String uname;
//    @Value("${user.age}")
//    private Integer age;
//    @Value("${user.sex}")
//    private String sex;
    @RequestMapping("/test")
    public String test(){
//        User user=new User();
//        user.setAge(age);
//        user.setUname(uname);
//        user.setSex(sex);
        return "sdedfewfwe";
    }

}
