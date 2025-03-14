package com.dao;

import java.util.List;

import java.util.ArrayList;

import com.entity.Student;

public class StudentDao {
	public List<Student>getallStudents(){
		
		List<Student> db = new ArrayList<Student>();
		
		db.add(new Student(1,"Ved",88,16));
		db.add(new Student(2,"Vedant",82,16));
		db.add(new Student(3,"Jay",76,16));
		db.add(new Student(4,"Viru",66,15));
		db.add(new Student(5,"Ram",59,16));
		db.add(new Student(6,"Sai",36,15));
		db.add(new Student(7,"Ganesh",84,16));
		db.add(new Student(8,"Dev",64,16));
		
		return db;
		
	}

}
