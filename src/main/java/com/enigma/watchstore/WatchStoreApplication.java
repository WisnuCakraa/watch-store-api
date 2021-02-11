package com.enigma.watchstore;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.enigma.watchstore.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WatchStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatchStoreApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(new Student(1L, "wisnu", "wisnu@gmail.com", LocalDate.of(2001, Month.APRIL, 2), 19));
    }

}
