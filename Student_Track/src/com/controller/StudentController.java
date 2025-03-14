package com.controller;

import java.util.List;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {
	StudentService service = null;

	public List<Student> getallStudentsController() {
		service = new StudentService();

		List<Student> db = service.getallStudentsServive();

		return db;

	}

	public List<Student> getallStudentsListnameStartswithV() {

		service = new StudentService();

		List<Student> db1 = service.getallStudentsListnameStartswithV();

		return db1;

	}

	public List<Student>  getallStudentsListmarksabove80() {
		
		service = new StudentService();
		
		List<Student> db2 = service.getallStudentsListmarksabove80();
		
		return db2;
		
		
	}

	public List<Student>  getallStudentsListagelessthan16() {
		
		service = new StudentService();
		
		List<Student> db3 = service.getallStudentsListagelessthan16();
		
		return db3;
		
	}
}
