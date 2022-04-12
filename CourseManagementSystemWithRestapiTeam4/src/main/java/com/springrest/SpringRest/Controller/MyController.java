package com.springrest.SpringRest.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRest.entities.Courses;
import com.springrest.SpringRest.services.CourseService;

@RestController
public class MyController
{
	@Autowired
	private CourseService cService;

	
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.cService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	 public Courses getCourse(@PathVariable String courseId)
	 {
		 return this.cService.getcourse(Long.parseLong(courseId));
	 }
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course)
	{
		return ((CourseService) this.cService).addCourse(course);
	}
	
	@PutMapping("/course")
	public Courses updateCourse(@RequestBody Courses course)
	{
		return this.cService.updateCourse(course);
	}
	
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
	
	try{
		this.cService.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		}
	
	catch(Exception e)
	{
		
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
}
