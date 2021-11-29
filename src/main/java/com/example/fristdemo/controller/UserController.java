package com.example.fristdemo.controller;

import com.example.fristdemo.domain.User;
import com.example.fristdemo.domain.UserDto;
import com.example.fristdemo.repository.UserRepository;
import com.example.fristdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.Date;

@RestController
public class UserController {
 
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserService userService;
 
  @GetMapping("/user/{id}")// 注意，此处使用的是GetMapping注解，该注解的作用类似与@RequestMapping(value="/user/{id}" ,method=RequestMethod.GET)，@PostMapping注解同理
  public User findById(@PathVariable Long id) {
    return userRepository.findById(1L).get();
  }

  @RequestMapping("/userAdd")
  public String userAdd() {
    UserDto uDto = new UserDto();
    Long id = (new Date()).getTime();
    System.out.println(id);
    uDto.setId(id);
    uDto.setName("ceshi");
    uDto.setAge("88");
    userService.add(uDto);
    return "seccuss";
  }
}