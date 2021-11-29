package com.example.fristdemo.service;

import com.example.fristdemo.domain.User;
import com.example.fristdemo.domain.UserDto;
import com.example.fristdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: wenguozhang
 * @date: Created in 2021/11/19 16:31
 * @Modified by:
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean add(UserDto uDto) {
        User user = getUserByUserDto(uDto);
        userRepository.save(user);
        return true;
    }

    private User getUserByUserDto(UserDto uDto){
        User user = new User();
        user.setId(uDto.getId());
        user.setAge(uDto.getAge());
        user.setName(uDto.getName());
        user.setBalance(uDto.getBalance());
        return user;
    }
}
