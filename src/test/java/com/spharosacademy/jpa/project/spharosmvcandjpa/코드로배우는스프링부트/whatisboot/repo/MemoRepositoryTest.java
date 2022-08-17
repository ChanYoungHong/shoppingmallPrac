package com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.repo;

import static org.junit.jupiter.api.Assertions.*;

import com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.entity.Memo;
import java.awt.print.Pageable;
import java.util.Optional;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MemoRepositoryTest {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass() {
        System.out.println(memoRepository.getClass().getName());
    }

    @Test
    public void testInsertDummies(){
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Memo memo = Memo.builder().memoText("Test test 수련회 조원" + i).build();
            memoRepository.save(memo);
        });
    }

    @Test
    public void testSelect() {
        Long mno = 100L;

        Optional<Memo> result = memoRepository.findById(mno);

        System.out.println("==================================");

        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println(memo);
        }
    }

    @Transactional
    @Test
    public void testSelect2() {

        Long mno = 100L;

        Memo memo = memoRepository.getOne(mno);

        System.out.println("==========================");

        System.out.println(memo);
    }

    @Test
    public void testUpdate() {
        Memo memo = Memo.builder()
            .mno(100L)
            .memoText("Update TExt")
            .build();

        System.out.println(memoRepository.save(memo));
    }

    @Test
    public void testDelete() {
        Long mno = 100L;

        memoRepository.deleteById(mno);
    }

    @Test
    public void testPageDefault() {

        Pageable pageable = (Pageable) PageRequest.of(0, 10);

        Page<Memo> result = memoRepository.findAll(
            (org.springframework.data.domain.Pageable) pageable);

        System.out.println(result);
    }
}