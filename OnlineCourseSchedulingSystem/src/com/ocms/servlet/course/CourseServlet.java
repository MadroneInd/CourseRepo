package com.ocms.servlet.course;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ocms.controller.CourseController;
import com.ocms.entity.Course;

/**
 * Servlet implementation class Course
 */
@WebServlet(name="/CourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter pw= response.getWriter();
		//pw.print("Entering this Class thanks");
		Course course = new Course() ;
		course.setCode(request.getParameter("code"));
		course.setName(request.getParameter("name"));
		course.setDuration(request.getParameter("duration"));
		CourseController courseController = new CourseController();
		int courseId =courseController.createCourse(course);
		//pw.print("Resultset:"+courseId);
		response.sendRedirect("Courses.jsp?id=1#Courseedit-tab");
		
	}

}
