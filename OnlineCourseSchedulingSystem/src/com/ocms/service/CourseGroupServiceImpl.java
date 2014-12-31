package com.ocms.service;

import java.io.IOException;
import java.util.List;

import com.ocms.dao.CourseGroupDao;
import com.ocms.entity.CourseGroup;



public class CourseGroupServiceImpl implements CourseGroupService{
	
	@SuppressWarnings("rawtypes")
	public String courseGroupCreate(List courseList, String groupName,  List repetitionList){
		
		String courseGroupId = null;
		CourseGroupDao CourseGroupDao = new CourseGroupDao();
		try {
			courseGroupId = CourseGroupDao.courseGroupCreate(courseList,groupName,repetitionList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return courseGroupId;
		
	}
	

	public CourseGroup selectGroup(CourseGroup courseGroup) throws IOException{
		
		CourseGroupDao CourseGroupDao = new CourseGroupDao();
	    CourseGroup courseGroupId = CourseGroupDao.selectGroup(courseGroup);
		return courseGroupId;
		
	}

}
