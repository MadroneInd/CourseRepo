package com.ocms.service;

import java.util.List;

import com.ocms.entity.CourseSeries;


public interface CourseSeriesService {

	@SuppressWarnings("rawtypes")
	public String courseSeriesCreate(List courseList, String locationCode, List repetitionList);
	public int courseSeriesPublish(CourseSeries courseSeries);
	
}
