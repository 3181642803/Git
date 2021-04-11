package cn.jiyun.controller;

import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Autowired
    private UserService userService;


    @RequestMapping("user/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
}
