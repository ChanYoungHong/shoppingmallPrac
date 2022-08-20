package com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.repo;

import com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.entity.GuestBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GeustBookRepository extends JpaRepository<GuestBook, Long>,
    QuerydslPredicateExecutor<GuestBook> {
}
