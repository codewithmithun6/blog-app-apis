package com.codewithmithun.blog.repositories;

import com.codewithmithun.blog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {
}
