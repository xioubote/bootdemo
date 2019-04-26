package com.boot.demo.bootdemo.mapper;

import com.boot.demo.bootdemo.common.MyMapper;
import com.boot.demo.bootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: yanyfa
 * @Date: 2019/3/12 14:30
 * @Description:
 */

@Mapper
public interface UserMapper extends MyMapper<User> {
    @Select("select * from user")
    List<User> selectAll();

    //@Insert("insert into user(name) value(#{name})")
    public int insert(User user);
}
