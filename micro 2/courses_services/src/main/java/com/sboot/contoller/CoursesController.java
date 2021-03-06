package com.sboot.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.model.Courses;
import com.sboot.services.CoursesService;

@RestController
@RequestMapping("/courses")
public class CoursesController {
	
	@Autowired
	private CoursesService coursesService;

	@RequestMapping("/student/{stuid}")
	public List<Courses> getCourses(@PathVariable("stuid") Long stuid){
		return this.coursesService.getCoursesOfStudent(stuid);
	}
}
