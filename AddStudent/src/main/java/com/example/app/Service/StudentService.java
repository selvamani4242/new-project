package com.example.app.Service;

import java.util.List;

import com.example.app.Entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Integer id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Integer id);
	
	List<Student> getByfirstname();
}
