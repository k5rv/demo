package com.example.demo.student;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
  private Long id;
  private String name;
  private String email;
  private LocalDate dob;
  private Integer age;

  public Student(String name, String email, LocalDate dob, Integer age) {
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.age = age;
  }
}
