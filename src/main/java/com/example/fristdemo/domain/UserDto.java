package com.example.fristdemo.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String age;

    private BigDecimal balance;

    private String otherFeild;
}