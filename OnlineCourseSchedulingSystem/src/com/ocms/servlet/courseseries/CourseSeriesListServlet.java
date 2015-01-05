package com.ocms.servlet.courseseries;

import java.io.IOException;
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

import com.ocms.controller.CourseController;
import com.ocms.controller.CourseSeriesController;
import com.ocms.dao.CourseDao;
import com.ocms.entity.CourseSeries;
import com.ocms.entity.Location;

/**
 * Servlet implementation class CourseSeriesList
 */
@WebServlet(urlPatterns={"/CourseSeriesListServlet"})
public class CourseSeriesListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final Log LOG = LogFactory.getLog(CourseDao.class);

	@SuppressWarnings("rawtypes")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LOG.info("Entering the CourseSeriesListServlet class");
		CourseSeriesController courseSeriesController = new CourseSeriesController();
		List courseSeriesList = courseSeriesController.selectAllCourseSeries();
		LOG.info("Course Series List: "+courseSeriesList);
        for (int i = 0; i < courseSeriesList.size(); i++) {
            String courseSeries = (String) courseSeriesList.get(i);
            LOG.info("Course Series["+i+ "]: "+courseSeries);
        }
		request.setAttribute("courseSeriesList", courseSeriesList);
		RequestDispatcher rd=request.getRequestDispatcher("courseSeriesList.jsp"); 
		rd.include(request, response);
		LOG.info("Exiting the CourseSeriesListServlet class");
	}

}
