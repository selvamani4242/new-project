package com.example.app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")	//table name in database
public class Student {

	@Id			//it is primary key in the database										
	@GeneratedValue(strategy = GenerationType.IDENTITY) // it is auto-generated command
	private int id;
	@Column(name="firstname" ,nullable = false)	//giving column name in database without given name it takes field name has column name
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")	
	private String email;
	
	public Student(){
		
	}
	public Student(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
}
