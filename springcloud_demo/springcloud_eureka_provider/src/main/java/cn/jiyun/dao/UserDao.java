package cn.jiyun.dao;

import cn.jiyun.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    void add(User user);

    List<User> findAll();
}
