package com.itwuyi.dubboconsumer.controller;
import model.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

@Controller
public class OrderController {
    @Reference//dubbo注解
    private UserService userService;
    @RequestMapping("/consumer/{id}")
    @ResponseBody
    public User getUser(@PathVariable Integer id){
        //调用服务
        System.out.println(id);
        User user= userService.findUserById(id);
        return user;
    }
}
