package com.ocms.controller;

import java.util.List;




import com.ocms.entity.CourseSeries;
import com.ocms.service.CourseSeriesService;
import com.ocms.service.CourseSeriesServiceImpl;


public class CourseSeriesController {
	
@SuppressWarnings("rawtypes")
public String courseSeriesCreate(List courseList, String locationCode, List repetitionList){
		
	CourseSeriesService css = new CourseSeriesServiceImpl();
		String CourseSeriesId = css.courseSeriesCreate(courseList,locationCode,repetitionList);
		return CourseSeriesId;
		
		}

@SuppressWarnings("rawtypes")
public int courseSeriesPublish(CourseSeries courseSeries){
		
	CourseSeriesService css = new CourseSeriesServiceImpl();
		int eventId = css.courseSeriesPublish(courseSeries);
		return eventId;
		
		}

}
