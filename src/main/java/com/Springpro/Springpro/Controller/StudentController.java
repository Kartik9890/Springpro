package com.Springpro.Springpro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/addStudent")
	public String postDetails(@RequestBody Student student)
	{
		 studentService.saveDetails(student);
		 return "posted";
	}
	
	
	@GetMapping("/getStudent")
	public List<Student>getDetails(){
		return studentService.getAllDetails();
	}
}
