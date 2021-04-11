package cn.jiyun.service;

import cn.jiyun.pojo.User;

import java.util.List;

public interface PService {
    User getUser(Integer id);

    void add(User user);

    List<User> findAll();
}
