package com.ocms.dao;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.ocms.entity.Course;
import com.ocms.entity.CourseSeries;
import com.ocms.helper.HibernateUtil;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;

public class Test {
	final static Log LOG = LogFactory.getLog(Test.class);

	@SuppressWarnings({ "unchecked", "null" })
	public static void main(String[] args) throws IOException {
		
		/*Course course = new Course();
		course.setId(170);
		course.setName("A++");
		course.setCode("A+");
	    course.setDuration("80");
		CourseDao cdao= new CourseDao();
		cdao.deleteCourse(course);
		CourseDao cdao= new CourseDao();
		Course course2 = new Course();
		List<Course> course2 = cdao.selectAllCourse();
		LOG.info("ID: "+course2);
		LOG.info("ID: "+course2.getId());
		LOG.info("ID: "+course2.getCode());
		LOG.info("ID: "+course2.getDuration());
		CourseGroupDao cdao = new CourseGroupDao();
		cdao.CourseGroupCreate(1, "core", 1);*/
		/*CourseSeries courseSeries = new CourseSeries();
		courseSeries.setCourseSeriesCompositeId("DVR-SHER-Fun-01");
		CourseSeriesDao csDao = new CourseSeriesDao();
		csDao.courseSeriesPublish(courseSeries);*/
		/*CourseSeries courseSeries = new CourseSeries();
		String locCode= "DVR-SHER";
		String courseCode = "Fun";
		int rep =0;
		CourseSeriesDao csDao = new CourseSeriesDao();
		csDao.courseSeriesCreate(courseCode,locCode, rep);*/
		//HttpSession session = null;
		//LOG.info("courseSeriesCourseList: "+ session.getAttribute("courseSeriesCourseList"));
		
	}

}
