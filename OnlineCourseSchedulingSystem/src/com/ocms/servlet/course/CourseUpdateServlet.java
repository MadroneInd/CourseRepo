package com.ocms.servlet.course;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ocms.controller.CourseController;
import com.ocms.entity.Course;


@WebServlet("/CourseUpdateServlet")
public class CourseUpdateServlet extends HttpServlet {
	final Log LOG = LogFactory.getLog(CourseSelect.class);
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Course course = new Course();
		LOG.info("Course:"+course);
		int id = Integer.parseInt(request.getParameter("id"));
		course.setId(id);
		course.setCode(request.getParameter("code"));
		course.setName(request.getParameter("name"));
		course.setDuration(request.getParameter("duration"));
		CourseController courseController = new CourseController();
		courseController.updateCourse(course);
		//pw.print("Resultset:"+courseId);
		request.setAttribute("course", course);
		RequestDispatcher rd=request.getRequestDispatcher("Courses.jsp"); 
		rd.include(request, response);
	}

}
