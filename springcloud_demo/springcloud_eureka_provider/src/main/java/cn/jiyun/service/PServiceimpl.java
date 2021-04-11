package cn.jiyun.service;


import cn.jiyun.dao.UserDao;
import cn.jiyun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PServiceimpl implements PService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getUser(Integer id) {
        return new User(id,"王菲",18);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
