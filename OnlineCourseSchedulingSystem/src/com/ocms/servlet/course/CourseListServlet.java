package com.ocms.servlet.course;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ocms.controller.CourseController;
import com.ocms.dao.CourseDao;



public class CourseListServlet extends HttpServlet {
	final Log LOG = LogFactory.getLog(CourseDao.class);
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("rawtypes")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("Entering the CourseListServlet class");
		HttpSession session = request.getSession(true);
		CourseController courseController = new CourseController();
		List courseList = courseController.selectAllCourse();
		session.setAttribute("courseList", courseList);
		response.sendRedirect("Courses.jsp");
		LOG.info("Exiting the CourseListServlet class");
	}

}
