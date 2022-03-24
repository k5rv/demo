package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student student1 = new Student(0L, "mike", "mike@gmail.com", LocalDate.of(2002, 12, 2));
      Student student2 = new Student("stan", "stan@gmail.com", LocalDate.of(1997, 10, 1));
      repository.saveAll(List.of(student1, student2));
    };
  }
}
