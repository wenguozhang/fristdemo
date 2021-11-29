package com.example.fristdemo.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String age;

    @Column
    private BigDecimal balance;
}