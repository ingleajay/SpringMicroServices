package com.sboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sboot.model.Student;
import com.sboot.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService stuservice;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{stuid}")
	public Student getStudent(@PathVariable("stuid") Long stuid) {
		
          Student student = this.stuservice.getstudent(stuid);
          List courses = this.restTemplate.getForObject("http://courses-service/courses/student/" + student.getId(), List.class);
	      student.setCourses(courses);
	      return student;
	}
	
	
}
