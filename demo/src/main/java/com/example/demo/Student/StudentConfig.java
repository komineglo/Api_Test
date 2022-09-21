package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    CommandLineRunner commandLineRunner(
    StudentRepository repository
    ) {
        return args -> {
            
               Student mariam= new Student(
                    
                    "Mariam",
                    "mariam.neglo@gmail.com",
                    LocalDate.of(2000, Month.MARCH, 4),
                    21
                );
                Student yves= new Student(
                    
                    "yves",
                    "yves.neglo@gmail.com",
                    LocalDate.of(2004, Month.MARCH, 23),
                    21
                );
                  repository.saveAll(
                   List.of(mariam, yves)
                  );
        };
    }
}
