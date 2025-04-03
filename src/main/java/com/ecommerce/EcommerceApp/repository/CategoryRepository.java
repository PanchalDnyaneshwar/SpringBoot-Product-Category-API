package com.ecommerce.EcommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.EcommerceApp.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
