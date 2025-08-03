package com.example.spring_boot_docker.controller;


import com.example.spring_boot_docker.model.AdminUser;
import com.example.spring_boot_docker.repository.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AdminUserController {
    @Autowired
    private AdminUserRepository userRepository;

    // 查询所有用户
    @GetMapping
    public List<AdminUser> getAllUsers() {
        return userRepository.findAll();
    }

    // 按名称查询用户
    @GetMapping("/search")
    public List<AdminUser> getUsersByName(@RequestParam String name) {
        return userRepository.findByUsername(name);
    }
}