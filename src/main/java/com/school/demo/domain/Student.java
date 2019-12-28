package com.school.demo.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students",schema = "svk")
public class Student {

    @Id
    @Column(name ="id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "class")
    private int cls;
    @Column(name = "grade")
    private char grade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cls=" + cls +
                ", grade=" + grade +
                '}';
    }
}
