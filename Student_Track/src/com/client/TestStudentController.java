package com.client;

import java.util.List;

import com.controller.StudentController;
import com.entity.Student;

public class TestStudentController {
	static StudentController sc = null;
	public static void main(String[] args) {
		sc = new StudentController();
		
		List<Student> db = sc.getallStudentsController();
		System.out.println(db);
		
		
		List<Student> db1 = sc.getallStudentsListnameStartswithV();
		System.out.println(db1);
		
		List<Student> db2 = sc.getallStudentsListmarksabove80();
		System.out.println(db2);
		
		List<Student> db3 =sc.getallStudentsListagelessthan16();
		System.out.println(db3);
		
		
	}

}
