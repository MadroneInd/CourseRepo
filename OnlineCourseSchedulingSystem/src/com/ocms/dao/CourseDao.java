package com.ocms.dao;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.ocms.entity.Course;

public class CourseDao extends AbstractDao {
	final Log LOG = LogFactory.getLog(CourseDao.class);
	
	public int createCourse(Course course) throws IOException{
		
		int courseId=0;
		
		initSession();
		courseId=insertDetails(course);
		commitSession();
        return courseId;
		
	}
	
	public void deleteCourse(Course course){
		
		initSession();
		deleteDetails(course);
		commitSession();
		
	}
	
	public void updateCourse(Course course) throws IOException{
		
		initSession();
		updateDetails(course);
		commitSession();
        
	}
	
	@SuppressWarnings("unchecked")
	public Course selectCourse(Course course){
		
		initSession();
		int id= course.getId();
		LOG.info("CourseDaoID: "+id);
		List<Course> list = selectDetails(course, "from Course where id = ? ");
		LOG.info("CourseDao: "+list);
		Course courseObj = (Course) list.get(0);
		commitSession();
		LOG.info("CourseDao: "+courseObj);
		LOG.info("CourseDao: "+courseObj.getName());
		LOG.info("CourseDao: "+courseObj.getCode());
		LOG.info("CourseDao: "+courseObj.getDuration());
        return courseObj;
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List selectAllCourse(){
		
		initSession();
		List<Course> courseList = selectAllDetails("from Course");
		commitSession();
		LOG.info("CourseDao: "+courseList);
        return courseList;
        
	}
}