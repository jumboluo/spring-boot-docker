package com.example.spring_boot_docker.repository;


import com.example.spring_boot_docker.model.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
    // 自定义查询方法（按名称查找）
    List<AdminUser> findByUsername(String username);
}

