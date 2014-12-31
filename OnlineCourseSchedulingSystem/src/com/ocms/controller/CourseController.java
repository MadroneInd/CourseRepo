package com.ocms.controller;

import java.io.IOException;
import java.util.List;

import com.ocms.entity.Course;
import com.ocms.service.CourseService;
import com.ocms.service.CourseServiceImpl;

public class CourseController {
	public int createCourse(Course course){
		
		CourseService cs = new CourseServiceImpl();
		int courseId = cs.createCourse(course);
		return courseId;
		
		}
	
	public void deleteCourse(Course course){
		
		CourseService cs = new CourseServiceImpl();
    	cs.deleteCourse(course);
    	
		}
	
	public void updateCourse(Course course) throws IOException{
		
		CourseService cs = new CourseServiceImpl();
		cs.updateCourse(course);
		
		}
	
	public Course selectCourse(Course course){
		
		CourseService cs = new CourseServiceImpl();
    	course=cs.selectCourse(course);
		return course;
		
		}
	
	@SuppressWarnings("rawtypes")
	public List selectAllCourse(){
		
		CourseService cs = new CourseServiceImpl();
		List courseList = cs.selectAllCourse();
		return courseList;
		
	}	

}