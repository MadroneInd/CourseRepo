package com.ocms.service;

import java.io.IOException;
import java.util.List;

import com.ocms.dao.CourseSeriesDao;
import com.ocms.entity.CourseSeries;


public class CourseSeriesServiceImpl implements CourseSeriesService  {
	
	@SuppressWarnings("rawtypes")
	public String courseSeriesCreate(List courseList, String locationCode, List repetitionList){
		
		String courseSeriesId = null;
		CourseSeriesDao courseSeriesDao = new CourseSeriesDao();
		
		try {
			courseSeriesId = courseSeriesDao.courseSeriesCreate(courseList,locationCode, repetitionList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return courseSeriesId;
		
	}
	
	@SuppressWarnings("rawtypes")
	public int courseSeriesPublish(CourseSeries courseSeries){
		
		int eventId = 0;
		CourseSeriesDao courseSeriesDao = new CourseSeriesDao();
		
		try {
			eventId = courseSeriesDao.courseSeriesPublish(courseSeries);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return eventId;
		
	}

}
