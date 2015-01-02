package com.ocms.servlet.location;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ocms.controller.LocationController;
import com.ocms.entity.Location;
import com.ocms.entity.LocationContact;

/**
 * Servlet implementation class CreateLocation
 */
@WebServlet("/CreateLocationServlet")
public class CreateLocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Location location = new Location();
		location.setCode(request.getParameter("code"));
		location.setName(request.getParameter("name"));
		location.setNotes(request.getParameter("notes"));
		location.setSite_url(request.getParameter("url"));
		location.setAddress_line1(request.getParameter("address_line1"));
		location.setAddress_line2(request.getParameter("address_line2"));
		location.setCity(request.getParameter("city"));
		location.setState(request.getParameter("state"));
		location.setState(request.getParameter("country"));
		location.setRegion(request.getParameter("region"));
		location.setPhone(request.getParameter("phone"));
		location.setFax(request.getParameter("fax"));
		location.setEmail(request.getParameter("email"));
		location.setZip(request.getParameter("zip"));
		LocationContact locationContact = new LocationContact();
		locationContact.setName(request.getParameter("pname"));
		locationContact.setTitle(request.getParameter("ptitle"));
		locationContact.setPhone(request.getParameter("pphone"));
		locationContact.setFax(request.getParameter("pfax"));
		locationContact.setEmail(request.getParameter("pemail"));
		LocationContact slocationContact = new LocationContact();
		slocationContact.setName(request.getParameter("sname"));
		slocationContact.setTitle(request.getParameter("stitle"));
		slocationContact.setPhone(request.getParameter("sphone"));
		slocationContact.setFax(request.getParameter("sfax"));
		slocationContact.setEmail(request.getParameter("semail"));
		LocationController locationController = new LocationController();
		location=locationController.createLocation(location, locationContact, slocationContact);
		response.sendRedirect("locations.jsp");
	}

}
