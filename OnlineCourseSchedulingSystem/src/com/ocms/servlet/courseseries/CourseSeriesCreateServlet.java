package com.ocms.servlet.courseseries;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ocms.controller.CourseController;
import com.ocms.controller.CourseSeriesController;
import com.ocms.controller.LocationController;

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
		String[] courseListArray = null; 
		String[] locationListArray = null;
		List<String> courseList =null;
		List<String> locationList =null;
		ArrayList<String> courseSeriesDetails= new ArrayList<String>();
		//int counter=0;
		
		courseListArray = request.getParameterValues("hidden_coursename[]");
		locationListArray = request.getParameterValues("hidden_locationname[]");
		LOG.info("courseArray: "+courseListArray);
		LOG.info("locationArray: "+locationListArray);
		/*for (String s: courseListArray)
	    {           
	        //Do your stuff here
	        System.out.println("courseListArray"+s); 
	    }
		for (String s: locationList)
	    {           
	        //Do your stuff here
	        System.out.println("locationList"+s); 
	    }*/
        
		String action = request.getParameter("action");
		LOG.info("action: "+action);
		if (action.equalsIgnoreCase("preview")) {
			
			CourseSeriesController courseSeriesController = new CourseSeriesController();
			try {
				courseSeriesDetails = courseSeriesController.courseSeriesPreview(courseListArray,locationListArray);
				List<String> courseSet = Arrays.asList(courseListArray);
				List<String> locationSet = Arrays.asList(locationListArray);
				CourseController courseController = new CourseController();
				courseList = courseController.selectAllCourse();
				LocationController locationController = new LocationController();
				locationList = locationController.selectAllLocation();
				LOG.info("courseSeriesDetails: "+courseSeriesDetails);
				LOG.info("courseSet: "+courseSet);
				LOG.info("locationSet: "+locationSet);
				LOG.info("courseList: "+courseList);
				LOG.info("locationList: "+locationList);
				request.setAttribute("previewList", courseSeriesDetails);
				request.setAttribute("courseSet", courseSet);
				request.setAttribute("locationSet", locationSet);
				request.setAttribute("courseList", courseList);
				request.setAttribute("locationList", locationList);
				
				RequestDispatcher rd=request.getRequestDispatcher("multipleLocation.jsp"); 
				rd.include(request, response);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		} else if (action.equalsIgnoreCase("create")) {
			CourseSeriesController courseSeriesController = new CourseSeriesController();
			try {
				String courseSeriesId = courseSeriesController.courseSeriesCreate(courseListArray,locationListArray);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LOG.info("Entering the CourseSeriesCreateServlet class");
			List courseSeriesList = courseSeriesController.selectAllCourseSeries();
			LOG.info("Course Series List: "+courseSeriesList);
			request.setAttribute("courseSeriesList", courseSeriesList);
			RequestDispatcher rd=request.getRequestDispatcher("courseSeriesList.jsp"); 
			rd.include(request, response);
		}
		
	/*CourseSeriesController courseSeriesController = new CourseSeriesController();
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
		rd.include(request, response);*/
		LOG.info("Exiting the CourseSeriesListServlet class");
	
	}

}
