package com.example.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.Entity.Student;
import com.example.app.Repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository repo;
	public StudentServiceImpl(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public void deleteStudentById(Integer id) {
		
		repo.deleteById(id);
	}

	@Override
	public List<Student> getByfirstname() {
		
		return repo.findAll();
	}



	
	
}
