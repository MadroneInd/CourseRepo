package com.ocms.servlet.coursegroup;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ocms.controller.CourseGroupController;
import com.ocms.controller.CourseSeriesController;

/**
 * Servlet implementation class CreateCourseGroupServlet
 */
@WebServlet("/CreateCourseGroupServlet")
public class CreateCourseGroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List courseList = null;
		List repetitionList = null;
		String groupName = null;
		courseList = (List) request.getAttribute("courseList");
		repetitionList = (List) request.getAttribute("repetitionList");
		groupName = request.getParameter("GroupName");
		CourseGroupController CourseGroupController = new CourseGroupController();
		String status = CourseGroupController.courseGroupCreate(courseList,groupName,repetitionList);
		//pw.print("Resultset:"+courseId);
		response.sendRedirect("Courses.jsp?id=1#Courseedit-tab");
	}

}
