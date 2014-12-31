package com.ocms.controller;


import java.io.IOException;
import java.util.List;

import com.ocms.entity.Location;
import com.ocms.entity.LocationContact;
import com.ocms.service.CourseService;
import com.ocms.service.CourseServiceImpl;
import com.ocms.service.LocationService;
import com.ocms.service.LocationServiceImpl;

public class LocationController {
	
	public Location createLocation(Location location, LocationContact locationContact ,LocationContact slocationContact){
		LocationService ls = new LocationServiceImpl();
    	ls.createLocation(location, locationContact, slocationContact);
		return location;
		}
	
	public void deleteLocation(Location location){
		LocationService ls = new LocationServiceImpl();
    	ls.deleteLocation(location);
		}
	
	public void updateLocation(Location location,LocationContact locationContact,LocationContact slocationContact) throws IOException{
		LocationService ls = new LocationServiceImpl();
    	ls.updateLocation(location, locationContact, slocationContact);
		}
	
	public Location selectLocation(Location location){
		LocationService ls = new LocationServiceImpl();
    	ls.selectLocation(location);
		return location;
		}
	
	@SuppressWarnings("rawtypes")
	public List selectAllLocation(){
		
		LocationService ls = new LocationServiceImpl();
		List locationList = ls.selectAllLocation();
		return locationList;
		
	}

}
