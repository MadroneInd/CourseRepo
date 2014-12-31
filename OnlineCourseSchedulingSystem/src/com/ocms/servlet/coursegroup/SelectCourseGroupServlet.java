package com.ocms.servlet.coursegroup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ocms.controller.CourseGroupController;
import com.ocms.dao.CourseDao;
import com.ocms.entity.CourseGroup;

/**
 * Servlet implementation class SelectCourseGroupServlet
 */
@WebServlet(urlPatterns={"/SelectCourseGroupServlet"})
public class SelectCourseGroupServlet extends HttpServlet {
	final Log LOG = LogFactory.getLog(CourseDao.class);
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LOG.info("Entering the SelectCourseGroupServlet class");
		HttpSession session = request.getSession(true);
		CourseGroup courseGroup = new CourseGroup();
		String id = request.getParameter("id");
		LOG.info("ID:"+id);
		courseGroup.setCompositeGroupId(id);
		CourseGroupController courseGroupController = new CourseGroupController();
		courseGroup = courseGroupController.selectGroup(courseGroup);
		session.setAttribute("courseGroup", courseGroup);
		response.sendRedirect("Courses.jsp#Courseedit-tab");
		LOG.info("Exiting the SelectCourseGroupServlet class");
		
	
	}

}
