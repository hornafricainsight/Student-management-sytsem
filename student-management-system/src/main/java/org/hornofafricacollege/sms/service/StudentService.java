package org.hornofafricacollege.sms.service;

import java.util.List;

import org.hornofafricacollege.sms.entity.Student;

public interface StudentService {
	 List<Student> getAllStudents();
	 Student saveStudent(Student student);
	 
		 
	 Student updateStudent(Student student);
	Student getStudentById(Long id);
	 
}
