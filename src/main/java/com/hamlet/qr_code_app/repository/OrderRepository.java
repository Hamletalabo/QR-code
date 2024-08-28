package com.hamlet.qr_code_app.repository;

import com.hamlet.qr_code_app.model.enity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
