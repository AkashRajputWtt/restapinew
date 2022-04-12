package com.springrest.SpringRest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.dao.CourseDao;
import com.springrest.SpringRest.entities.Courses;



@Service

public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	public CourseServiceImpl() 
	{
		

	 }
		@Override
		public List<Courses> getCourses() {
			
			return courseDao.findAll();
		}
		
		
		@Override
		public Courses getcourse(long courseId) {
			
			return courseDao.getOne(courseId);
		}
		
		
		@Override
		public Courses addCourse(Courses course) {
			courseDao.save(course);
			return course;
		}
		
		
		@Override
		public Courses updateCourse(Courses course) {
			courseDao.save(course);
			return course;
		}
		
		
		@Override
		public void deleteCourse(long parseLong) {
			Courses entity = courseDao.getOne(parseLong);
			courseDao.delete(entity);
			}
			
}
	
	

