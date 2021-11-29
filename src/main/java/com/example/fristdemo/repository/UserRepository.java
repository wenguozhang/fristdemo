package com.example.fristdemo.repository;

import com.example.fristdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wgz
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
}