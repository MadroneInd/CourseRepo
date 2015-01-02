package com.ocms.servlet.location;

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

import com.ocms.controller.LocationController;
import com.ocms.dao.CourseDao;


@WebServlet(urlPatterns={"/LocationListServlet"})
public class LocationListServlet extends HttpServlet {
	final Log LOG = LogFactory.getLog(CourseDao.class);
	private static final long serialVersionUID = 1L;
   
	@SuppressWarnings("rawtypes")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("Entering the CourseListServlet class");
		HttpSession session = request.getSession(true);
		LocationController locationController = new LocationController();
		List locationList = locationController.selectAllLocation();
		session.setAttribute("locationList", locationList);
		response.sendRedirect("locations.jsp");
		LOG.info("Exiting the CourseListServlet class");
	}

}