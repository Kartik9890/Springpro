package com.Springpro.Springpro.Service;

//import org.hibernate.mapping.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Repository.StudentRepo;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveDetails(Student student) {
		
		return studentRepo.save(student);
	}
	
	
	public List<Student> getAllDetails()
	{
		
		return studentRepo.findAll();
		
	}

	
	
	
	
}
