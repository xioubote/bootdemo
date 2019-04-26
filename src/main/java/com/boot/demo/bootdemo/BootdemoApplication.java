package com.boot.demo.bootdemo;

import com.boot.demo.bootdemo.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.boot.demo.bootdemo.mapper")
public class BootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootdemoApplication.class, args);
        User user = new User();
        user.setName("王五");
        System.out.println(user.getName());
    }

}

