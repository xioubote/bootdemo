package com.boot.demo.bootdemo.controller;

import com.boot.demo.bootdemo.domain.User;
import com.boot.demo.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: yanyfa
 * @Date: 2019/3/12 14:32
 * @Description:
 */

@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/listAll")
    @ResponseBody
    public List<User> listAll() {
        return userService.listAll();
    }

    @GetMapping("/addUser")
    public int save(){
        User user = new User();
        user.setName("老王");
        return userService.save(user);
    }
    @GetMapping("/add")
    @ResponseBody
    public String print(){
        return "OK";
    }
}
