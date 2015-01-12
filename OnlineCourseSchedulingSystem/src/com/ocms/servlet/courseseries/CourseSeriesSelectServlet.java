package com.ocms.servlet.courseseries;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;







import com.google.gson.Gson;
import com.ocms.controller.CourseSeriesController;
import com.ocms.entity.CourseSeries;
import com.ocms.servlet.course.CourseSelect;


@WebServlet("/CourseSeriesSelectServlet")
public class CourseSeriesSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final Log LOG = LogFactory.getLog(CourseSelect.class);

	@SuppressWarnings({ "null", "unchecked" })
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("Entering the CourseSeriesSelectServlet class");
		String id= null;
		HttpSession session = request.getSession();
		CourseSeries courseSeries = new CourseSeries();
		id = request.getParameter("id");
		LOG.info("ID:"+id);
		courseSeries.setCourseTitle(id);
		CourseSeriesController courseSeriesController = new CourseSeriesController();
		List<CourseSeries> courseSeriesCourseList = courseSeriesController.selectCourseSeries(courseSeries);
		LOG.info("List"+courseSeriesCourseList);
		String json = new Gson().toJson(courseSeriesCourseList);
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	    LOG.info("Session "+session.getId());
	    session.setAttribute("courseSeriesCourseList", courseSeriesCourseList);
	    LOG.info("Session2 "+session.getId());
		LOG.info("Exiting the CourseSeriesSelectServlet class");
	}
}
