package com.ocms.servlet.courseseries;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ocms.controller.CourseSeriesController;
import com.ocms.dao.CourseSeriesDao;

/**
 * Servlet implementation class CourseSeriesCreateServlet
 */
@WebServlet(urlPatterns={"/CourseSeriesCreateServlet"})
public class CourseSeriesCreateServlet extends HttpServlet {
	final Log LOG = LogFactory.getLog(CourseSeriesCreateServlet.class);
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LOG.info("Entering into Create Course Series Servlet");
		ArrayList<String> courseList = new ArrayList<String>();
		ArrayList<Integer> repetitionList = new ArrayList<Integer>();
		ArrayList<String> locationList = new ArrayList<String>();
		//int counter=0;
		
		Enumeration paramNames = request.getParameterNames();
        while(paramNames.hasMoreElements()) 
        {
            Object objLoc= paramNames.nextElement();
        	String locName = (String)objLoc;
            locationList.add( request.getParameter(locName));
            Object objCou= paramNames.nextElement();
            String couName = (String)objCou;
            courseList.add( request.getParameter(couName));
            //repetitionList.add( request.getParameterValues(paramName));
            
        }
		LOG.info("courseList: "+courseList);
		LOG.info("repetitionList: "+repetitionList);
		LOG.info("locationList: "+locationList);
		
		
		
	CourseSeriesController courseSeriesController = new CourseSeriesController();
		try {
			String courseSeriesId = courseSeriesController.courseSeriesCreate(courseList,locationList,repetitionList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOG.info("Entering the CourseSeriesListServlet class");
		List courseSeriesList = courseSeriesController.selectAllCourseSeries();
		LOG.info("Course Series List: "+courseSeriesList);
		request.setAttribute("courseSeriesList", courseSeriesList);
		RequestDispatcher rd=request.getRequestDispatcher("courseSeriesList.jsp"); 
		rd.include(request, response);
		LOG.info("Exiting the CourseSeriesListServlet class");
	
	}

}
