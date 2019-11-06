package com.lzhhuo.shiro;

import com.lzhhuo.shiro.entity.User;
import com.lzhhuo.shiro.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShiroApplicationTests {
    @Resource
    private UserService userService;
    @Test
    void contextLoads() {
        User rose = userService.queryByUsername("rose");
        System.out.println(rose);

    }

}
