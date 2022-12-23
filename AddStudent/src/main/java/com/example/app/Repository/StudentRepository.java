package com.example.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.app.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>   // Student is jpa entity, Integer is datatype of given primary key
{		

	List<Student> findByfirstname(String firstname);
}
