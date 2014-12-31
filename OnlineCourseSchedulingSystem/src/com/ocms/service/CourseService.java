package com.ocms.service;

import java.io.IOException;
import java.util.List;

import com.ocms.entity.Course;

public interface CourseService {
	
	public int createCourse(Course course);
	public void deleteCourse(Course course);
	public void updateCourse(Course course) throws IOException;
	public Course selectCourse(Course course);
	@SuppressWarnings("rawtypes")
	public List selectAllCourse();
	
}