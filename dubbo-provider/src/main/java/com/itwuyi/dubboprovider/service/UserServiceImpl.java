package com.itwuyi.dubboprovider.service;
import model.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.UserService;

//此处的@Service是dubbo下的注解，不是spring的注解
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("itwuyi");
        return user;
    }
}
