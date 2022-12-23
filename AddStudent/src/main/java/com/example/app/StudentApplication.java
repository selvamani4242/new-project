package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.Entity.Student;
import com.example.app.Repository.StudentRepository;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		System.out.println("My application is running");
	}

	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {
		/*
		Student studentS1= new Student("Keerthi", "vasan", "keerthivasan@gmail.com");
		repo.save(studentS1);
		
		Student studentS2= new Student("Prabha", "karan", "prabhakaran@gmail.com");
		repo.save(studentS2);
		
		Student studentS3= new Student("Vedha", "prakash", "vedhaprakash@gmail.com");
		repo.save(studentS3);
		*/
	}

}
