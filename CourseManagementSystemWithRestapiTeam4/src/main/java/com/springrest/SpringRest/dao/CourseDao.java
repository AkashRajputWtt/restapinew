package com.springrest.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long>
{

}
