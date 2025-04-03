package com.ecommerce.EcommerceApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.EcommerceApp.entity.Product;
import com.ecommerce.EcommerceApp.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productServices;

	@GetMapping
	public Page<Product> getAllProducts(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "2") int size) {

		return productServices.getAllProducts(page, size);
	}

	@GetMapping("/{di}")
	public Optional<Product> getProductById(@PathVariable Long di) {
		return productServices.getProductById(di);
	}

	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productServices.createProduct(product);
	}

	@PutMapping
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
		return productServices.updateProduct(id, product);
	}

	@DeleteMapping("/{di}")
	public void deleteProduct(@PathVariable Long id) {
		productServices.deleteProduct(id);
	}

}
