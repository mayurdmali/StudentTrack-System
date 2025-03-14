package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	StudentDao dao = null;
	// getallStudents
	public List<Student> getallStudentsServive() {

		dao = new StudentDao();

		List<Student> db = dao.getallStudents();

		return db;

	}
	// getallStudentsListnameStartswithV
	public List<Student> getallStudentsListnameStartswithV() {
		
		List<Student> db1 = new ArrayList<Student>();
		
		dao = new StudentDao();
		
		List<Student> db = dao.getallStudents();
		
		for (Student s : db) {
			if(s.getName().startsWith("V")) {
				db1.add(s);
			}
			
		}
		return db1;
	}
	// getallStudentsListmarksabove80
	public List<Student> getallStudentsListmarksabove80() {
		List<Student> db2 = new ArrayList<Student>();
		
		dao = new StudentDao();
		
		List<Student> db = dao.getallStudents();
		
		for (Student s2 : db) {
			if(s2.getMarks() > 80) {
				db2.add(s2);
			}
			
		}
		
		return db2;
	}
	public List<Student> getallStudentsListagelessthan16() {
		List<Student> db3 = new ArrayList<Student>();
		
		dao = new StudentDao();
		
		List<Student> db = dao.getallStudents();
		
		for (Student s3 : db) {
			if(s3.getAge()< 16) {
				db3.add(s3);
			}
			
		}
		
		return db3;
	}

}
