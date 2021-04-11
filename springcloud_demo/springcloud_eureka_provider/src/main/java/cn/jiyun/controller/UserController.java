package cn.jiyun.controller;

import cn.jiyun.pojo.User;
import cn.jiyun.service.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private PService pService;
    @RequestMapping("add")
    public String add(User user){
        pService.add(user);
        return "redirect:/user/list";
    }
    @RequestMapping("toadd")
    public String toadd(){
        return "a";
    }
    @RequestMapping("list")
    public String findAll(Model model){
        List<User> list=pService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
}
