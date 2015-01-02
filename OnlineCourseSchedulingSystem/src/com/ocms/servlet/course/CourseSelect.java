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



@WebServlet(urlPatterns={"/courseSelect"})
public class CourseSelect extends HttpServlet {
	final Log LOG = LogFactory.getLog(CourseSelect.class);
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("Entering the CourseSelect class");
		Course course = new Course();
		int id = Integer.parseInt(request.getParameter("id"));
		LOG.info("ID:"+id);
		course.setId(id);
		CourseController courseController = new CourseController();
		course = courseController.selectCourse(course);
		LOG.info("Name"+course.getName());
		LOG.info("Code"+course.getCode());
		LOG.info("Duration"+course.getDuration()); 
		request.setAttribute("course", course);
		RequestDispatcher rd=request.getRequestDispatcher("courses.jsp"); 
		rd.include(request, response);
		//response.sendRedirect("Courses.jsp#Courseedit-tab");
		LOG.info("Exiting the CourseListServlet class");
	}

}
