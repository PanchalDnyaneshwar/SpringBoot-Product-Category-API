﻿# Springboot-Product-Category-API

 
## 📌 Project Description
This Spring Boot application provides RESTful APIs for managing categories and products with a **one-to-many** relationship. It includes:
- CRUD operations for **Category** & **Product**.
- **Pagination** support for listing products and categories.
- Uses **Spring Data JPA**, **Hibernate**, and **MySQL**.

## 🚀 Tech Stack
- **Java 17**  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **Hibernate**  
- **MySQL**  
- **Eclipse IDE**  
- **Git & GitHub**  

## 🔧 API Endpoints
### **Category API**
- `GET /api/categories?page=1&size=10` → Get paginated categories.
- `POST /api/categories` → Create a new category.
- `GET /api/categories/{id}` → Get category by ID.
- `PUT /api/categories/{id}` → Update category by ID.
- `DELETE /api/categories/{id}` → Delete category.

### **Product API**
- `GET /api/products?page=1&size=10` → Get paginated products.
- `POST /api/products` → Create a new product.
- `GET /api/products/{id}` → Get product by ID.
- `PUT /api/products/{id}` → Update product by ID.
- `DELETE /api/products/{id}` → Delete product.
