package com.ocms.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ocms.dao.CourseDao;
import com.ocms.dao.CourseSeriesDao;
import com.ocms.entity.CourseSeries;


public class CourseSeriesServiceImpl implements CourseSeriesService  {
	
	@SuppressWarnings("rawtypes")
	public String courseSeriesCreate(String[] courseListArray, String[] locationListArray) throws SQLException{
		
		String courseSeriesId = null;
		CourseSeriesDao courseSeriesDao = new CourseSeriesDao();
		
		try {
			courseSeriesId = courseSeriesDao.courseSeriesCreate(courseListArray,locationListArray);
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
	
	@SuppressWarnings("rawtypes")
	public List selectAllCourseSeries(){
		
		CourseSeriesDao courseSeriesdao = new CourseSeriesDao();
		List courseSeriesList = courseSeriesdao.selectAllCourseSeries();
		return courseSeriesList;
		
	}
	
	@SuppressWarnings("rawtypes")
	public List selectCourseSeries(CourseSeries courseSeries){
		
		CourseSeriesDao courseSeriesdao = new CourseSeriesDao();
		List courseSeriesList = courseSeriesdao.selectCourseSeries(courseSeries);
		return courseSeriesList;
		
	}

	@Override
	public ArrayList<String> courseSeriesPreview(String[] courseListArray, String[] locationListArray) throws SQLException {
		
		ArrayList<String> courseSeriesDetails= new ArrayList<String>();
		CourseSeriesDao courseSeriesDao = new CourseSeriesDao();
		
		try {
			courseSeriesDetails = courseSeriesDao.courseSeriesPreview(courseListArray,locationListArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return courseSeriesDetails;
	}

}
