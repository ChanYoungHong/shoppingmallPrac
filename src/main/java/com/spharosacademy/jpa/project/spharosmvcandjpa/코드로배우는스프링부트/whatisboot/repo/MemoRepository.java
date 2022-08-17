package com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.repo;

import com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
