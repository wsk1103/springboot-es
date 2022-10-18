package com.sk.es;

import com.sk.es.dao.UserDao;
import com.sk.es.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sk
 * @time 2022/10/18
 * @desc say
 **/
@SpringBootTest
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void save() {
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setUsername("22g");
        user.setPassword("3434");
        user.setAge(44);
        User sa = userDao.save(user);
        System.err.println(sa);
    }

}
