package com.example.fristdemo;

import com.example.fristdemo.domain.UserDto;
import com.example.fristdemo.repository.UserRepository;
import com.example.fristdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @Description:
 * @author: wenguozhang
 * @date: Created in 2021/11/19 16:41
 * @Modified by:
 */
@SpringBootTest
public class UserServiceTest {
    @InjectMocks
    private UserService us;
    @Mock
    private UserRepository userRepository;

    @Test
    public void add() {
        UserDto udd = new UserDto();
        udd.setId(9L);
        udd.setAge("26");
        udd.setName("ceshi");
        boolean flag = us.add(udd);
        System.out.println(flag);
        Assert.isTrue(flag,"添加失败");
    }
}
