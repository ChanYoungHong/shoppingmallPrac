package com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.repo;

import static org.junit.jupiter.api.Assertions.*;

import com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.entity.GuestBook;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeustBookRepositoryTest {

    @Autowired
    private GeustBookRepository geustBookRepository;

    @Test
    public void insertDummy() {

        IntStream.rangeClosed(1, 100).forEach(i -> {

            GuestBook guestBook = GuestBook.builder()
                .title("Title......" + i)
                .content("Content....." + i)
                .writer("user" + (i % 10))
                .build();
            System.out.println(geustBookRepository.save(guestBook));
        });
    }
}