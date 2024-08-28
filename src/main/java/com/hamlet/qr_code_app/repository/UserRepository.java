package com.hamlet.qr_code_app.repository;

import com.hamlet.qr_code_app.model.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
