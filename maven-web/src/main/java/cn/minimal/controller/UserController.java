package cn.minimal.controller;

import cn.minimal.pojo.UserInfo;
import cn.minimal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findUserById")
    public String findUserById(Model model){
        UserInfo userInfo=userService.findUserById(1);
        model.addAttribute("user",userInfo);
        return "userDetail";
    }
}
