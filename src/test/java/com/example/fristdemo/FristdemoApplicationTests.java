package com.example.fristdemo;

import com.example.fristdemo.domain.User;
import com.example.fristdemo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

@SpringBootTest
@ActiveProfiles("test")
class FristdemoApplicationTests {

    @Autowired
    private UserRepository repository;


    @Test
    public void test(){
        User u = repository.findById(1L).get();
        System.out.println("张三".equals(u.getName()));
        Assert.isTrue("张三".equals(u.getName()) ,"第一个人应该是张三");
    }
}
