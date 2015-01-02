package com.ocms.servlet.courseseries;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ocms.controller.CourseSeriesController;

/**
 * Servlet implementation class CourseSeriesCreateServlet
 */
@WebServlet(urlPatterns={"/CourseSeriesCreateServlet"})
public class CourseSeriesCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List courseList = null;
		List repetitionList = null;
		String locationCode = null;
		courseList = (List) request.getAttribute("courseList");
		repetitionList = (List) request.getAttribute("repetitionList");
		locationCode = request.getParameter("locationCode");
		CourseSeriesController courseSeriesController = new CourseSeriesController();
		String courseSeriesId = courseSeriesController.courseSeriesCreate(courseList,locationCode,repetitionList);
		//pw.print("Resultset:"+courseId);
		response.sendRedirect("courses.jsp?id=1#Courseedit-tab");
	
	}

}
