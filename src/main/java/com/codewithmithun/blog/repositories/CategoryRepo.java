package com.codewithmithun.blog.repositories;

import com.codewithmithun.blog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
