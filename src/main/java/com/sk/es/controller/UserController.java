package com.sk.es.controller;

import com.sk.es.dao.UserDao;
import com.sk.es.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sk
 * @time 2022/10/18
 * @desc say
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/addUser")
    public String addUser(String username, String password, Integer age) {
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        User ss = userDao.save(user);
        return String.valueOf(ss.getId());
    }

    @PostMapping("/deleteUser")
    public String deleteUser(Long id) {
        userDao.deleteById(id);
        return "Success!";
    }

    @PostMapping("/updateUser")
    public String updateUser(Long id, String username, String password, Integer age) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        return String.valueOf(userDao.save(user).getId());
    }

    @PostMapping("/getUser")
    public User getUser(Long id) {
        return userDao.findById(id).get();
    }

    @PostMapping("/getAllUsers")
    public Iterable<User> getAllUsers() {
        return userDao.findAll();
    }

}
