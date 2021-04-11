package cn.jiyun.service;

import cn.jiyun.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(Integer id) {
        return new User(id,"许瑞标",18);
    }
}
