package com.spharosacademy.jpa.project.spharosmvcandjpa.user.repo;

import com.spharosacademy.jpa.project.spharosmvcandjpa.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepoo extends JpaRepository<User, Long> {
}
