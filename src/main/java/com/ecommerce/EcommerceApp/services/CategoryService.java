package com.ecommerce.EcommerceApp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecommerce.EcommerceApp.entity.Category;
import com.ecommerce.EcommerceApp.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public Page<Category> getAllCategories(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	public Optional<Category> getCategoryById(Long id) {
		return categoryRepository.findById(id);
	}

	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category updateCategory(Long id, Category categoryDetails) {
		return categoryRepository.findById(id).map(category -> {
			category.setName(categoryDetails.getName());
			category.setDescription(categoryDetails.getDescription());
			return categoryRepository.save(category);
		}).orElseThrow(() -> new RuntimeException("Category not found"));
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}