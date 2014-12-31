package com.ocms.servlet.courseseries;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ocms.controller.CourseSeriesController;
import com.ocms.entity.CourseSeries;

/**
 * Servlet implementation class CourseSeriesPublishingServlet
 */
@WebServlet(urlPatterns={"/CourseSeriesPublishingServlet"})
public class CourseSeriesPublishingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eventId=0;
		CourseSeries courseSeries = new CourseSeries();
		
		courseSeries.setCourseSeriesCompositeId(request.getParameter("courseSeriesId"));
		//courseSeries.setStartDate(request.getParameter("startDate"));
		//courseSeries.setStartDate(request.getParameter("endDate"));
		courseSeries.setMaxNoOfStuReg(Integer.parseInt(request.getParameter("courseSeriesId")));
		courseSeries.setCourseSeriesCompositeId(request.getParameter("shortName"));
		CourseSeriesController courseSeriesController = new CourseSeriesController();
		eventId = courseSeriesController.courseSeriesPublish(courseSeries);
		//pw.print("Resultset:"+courseId);
		response.sendRedirect("Courses.jsp?id=1#Courseedit-tab");
		
	}

}
