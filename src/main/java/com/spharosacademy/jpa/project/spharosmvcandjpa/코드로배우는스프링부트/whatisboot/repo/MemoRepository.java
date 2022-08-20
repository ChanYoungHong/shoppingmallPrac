package com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.repo;

import com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.entity.Memo;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {

    List<Memo> findByMnoBetweenOrderByMnoDesc(Long from, Long to);

    Page<Memo> findByMnoBetween(Long from, Long to, Pageable pageable);
}
