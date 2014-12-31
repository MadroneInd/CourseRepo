package com.ocms.controller;

import java.io.IOException;
import java.util.List;

import com.ocms.entity.CourseGroup;
import com.ocms.service.CourseGroupService;
import com.ocms.service.CourseGroupServiceImpl;

public class CourseGroupController {
	
	@SuppressWarnings("rawtypes")
	public String courseGroupCreate(List courseList, String groupName, List repetitionList){
			
		CourseGroupService cgs = new CourseGroupServiceImpl();
			String courseGroupId = cgs.courseGroupCreate(courseList,groupName,repetitionList);
			return courseGroupId;
			
			}
	
		public CourseGroup selectGroup(CourseGroup courseGroup) throws IOException{
		
		CourseGroupService cgs = new CourseGroupServiceImpl();
		CourseGroup courseGroupId = cgs.selectGroup(courseGroup);
			return courseGroupId;
			
			}

}
