package com.hamlet.qr_code_app.repository;

import com.hamlet.qr_code_app.model.enity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
