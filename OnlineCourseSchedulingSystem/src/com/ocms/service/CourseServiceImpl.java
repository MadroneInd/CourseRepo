package com.ocms.service;

import java.io.IOException;


import java.util.List;

import com.ocms.dao.CourseDao;
import com.ocms.entity.Course;

public class CourseServiceImpl implements CourseService {
	
	public int createCourse(Course course) {
		CourseDao coursedao = new CourseDao();
		int courseId = 0;
		try {
			courseId = coursedao.createCourse(course);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return courseId;
	}
	
	public void deleteCourse(Course course) {
		
		CourseDao coursedao = new CourseDao();
		coursedao.deleteCourse(course);
		
	}
	
	public void updateCourse(Course course) throws IOException {
		
		CourseDao coursedao = new CourseDao();
		coursedao.updateCourse(course);
		
	}
	
	public Course selectCourse(Course course) {
		
		CourseDao coursedao = new CourseDao();
		course=coursedao.selectCourse(course);
		return course;
		
	}
	
	@SuppressWarnings("rawtypes")
	public List selectAllCourse(){
		
		CourseDao coursedao = new CourseDao();
		List courseList = coursedao.selectAllCourse();
		return courseList;
		
	}

}
