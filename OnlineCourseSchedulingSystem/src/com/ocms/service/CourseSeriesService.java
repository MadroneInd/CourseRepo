package com.ocms.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ocms.entity.CourseSeries;


public interface CourseSeriesService {

	@SuppressWarnings("rawtypes")
	public String courseSeriesCreate(ArrayList<String> courseList, ArrayList<String> locationList, ArrayList<Integer> repetitionList) throws SQLException;
	public int courseSeriesPublish(CourseSeries courseSeries);
	@SuppressWarnings("rawtypes")
	public List selectAllCourseSeries();
	
}
