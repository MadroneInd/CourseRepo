package com.ocms.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;












import com.ocms.entity.Course;
import com.ocms.entity.CourseSeries;
import com.ocms.service.CourseSeriesService;
import com.ocms.service.CourseSeriesServiceImpl;
import com.ocms.service.CourseService;
import com.ocms.service.CourseServiceImpl;


public class CourseSeriesController {
	
@SuppressWarnings("rawtypes")
public String courseSeriesCreate(String[] courseListArray,String[] locationListArray) throws SQLException{
		
	CourseSeriesService css = new CourseSeriesServiceImpl();
		String CourseSeriesId = css.courseSeriesCreate(courseListArray,locationListArray);
		return CourseSeriesId;
		
		}

@SuppressWarnings("rawtypes")
public List selectAllCourseSeries(){
	
	CourseSeriesService cs = new CourseSeriesServiceImpl();
	List courseSeriesList = cs.selectAllCourseSeries();
	return courseSeriesList;
	
}

@SuppressWarnings("rawtypes")
public int courseSeriesPublish(CourseSeries courseSeries){
		
	CourseSeriesService css = new CourseSeriesServiceImpl();
		int eventId = css.courseSeriesPublish(courseSeries);
		return eventId;
		
		}

public List selectCourseSeries(CourseSeries courseSeries){
	
	CourseSeriesService cs = new CourseSeriesServiceImpl();
	List courseSeriesList=cs.selectCourseSeries(courseSeries);
	return courseSeriesList;
	
	}

public ArrayList<String> courseSeriesPreview(String[] courseListArray,String[] locationListArray) throws SQLException{
	
	ArrayList<String> courseSeriesDetails= new ArrayList<String>();
	CourseSeriesService css = new CourseSeriesServiceImpl();
		courseSeriesDetails = css.courseSeriesPreview(courseListArray,locationListArray);
		return courseSeriesDetails;
		
		}

}
