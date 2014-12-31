package com.ocms.service;

import java.io.IOException;
import java.util.List;

import com.ocms.entity.CourseGroup;

public interface CourseGroupService {
	
	@SuppressWarnings("rawtypes")
	public String courseGroupCreate(List courseList, String groupName, List RepetitionList);
	public CourseGroup selectGroup(CourseGroup courseGroup) throws IOException;

}
