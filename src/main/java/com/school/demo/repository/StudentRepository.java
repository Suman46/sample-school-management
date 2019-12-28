package com.school.demo.repository;

import com.school.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    /*@Query("Select a from Student a Where a.name = ?1") */
    Optional<Student> findByName(String name);

}
