package com.ocms.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ocms.entity.CourseSeries;


public interface CourseSeriesService {

	@SuppressWarnings("rawtypes")
	public String courseSeriesCreate(String[] courseListArray, String[] locationListArray) throws SQLException;
	public int courseSeriesPublish(CourseSeries courseSeries);
	@SuppressWarnings("rawtypes")
	public List selectAllCourseSeries();
	@SuppressWarnings("rawtypes")
	public List selectCourseSeries(CourseSeries courseSeries);
	public ArrayList<String> courseSeriesPreview(String[] courseListArray, String[] locationListArray) throws SQLException;
}
