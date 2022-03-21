package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

  @GetMapping
  public List<Student> getStudents() {
    Student student1 = new Student(0L, "mike", "mike@gmail.com", LocalDate.of(2002, 12, 2), 20);
    Student student2 = new Student(1L, "stan", "stan@gmail.com", LocalDate.of(1997, 10, 1), 25);

    return List.of(student1, student2);
  }
}
