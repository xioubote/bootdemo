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
    //第一种方式
    @Select("select * from user")
    List<User> selectAll();

    //第二种方式
    public int insert(User user);
}
