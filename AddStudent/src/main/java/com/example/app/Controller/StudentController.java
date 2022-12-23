package com.example.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.Entity.Student;
import com.example.app.Service.StudentService;
import com.example.app.Service.StudentServiceImpl;

@Controller
public class StudentController {

	private StudentService studentservice;

	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	//handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String liststudents(Model model){
		model.addAttribute("students",studentservice.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student=new Student(); 				//create student object to hold student form data
		model.addAttribute("student",student);
		return "create_student";
		
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("stuednt")Student student){
		studentservice.saveStudent(student);
		return "redirect:/students";
		
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Integer id,Model model) {
		model.addAttribute("student", studentservice.getStudentById(id));
		return "edit_student";	
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Integer id,
			@ModelAttribute("student") Student student,
	Model model){
		//get student from database by id
		Student existingStudent= studentservice.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		
		//save updated student object
		studentservice.saveStudent(existingStudent);
		return "redirect:/students";
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		studentservice.deleteStudentById(id);
		return "redirect:/students";
	}
	@GetMapping("/students/firstname")
	public String firstNamePage(Model model) {
		model.addAttribute("student",studentservice.getByfirstname());
		return "index";
	}
}
