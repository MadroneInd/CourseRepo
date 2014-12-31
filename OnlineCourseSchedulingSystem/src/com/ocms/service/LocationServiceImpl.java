package com.ocms.service;

import java.io.IOException;
import java.util.List;

import com.ocms.dao.CourseDao;
import com.ocms.dao.LocationDao;
import com.ocms.entity.Course;
import com.ocms.entity.Location;
import com.ocms.entity.LocationContact;

public class LocationServiceImpl implements LocationService {
	
	public Location createLocation(Location location, LocationContact locationContact, LocationContact slocationContact) {
		LocationDao locationdao = new LocationDao();
		try {
			locationdao.createLocation(location, locationContact, slocationContact);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return location;
	}

	public void deleteLocation(Location location) {
		LocationDao locationdao = new LocationDao();
		locationdao.deleteLocation(location);
	}
	
	public Location updateLocation(Location location, LocationContact locationContact, LocationContact slocationContact) throws IOException {
		LocationDao locationdao = new LocationDao();
		locationdao.updateLocation(location, locationContact, slocationContact);
		return location;
	}
	
	public Location selectLocation(Location location) {
		LocationDao locationdao = new LocationDao();
		locationdao.selectLocation(location);
		return location;
	}
	
	@SuppressWarnings("rawtypes")
	public List selectAllLocation(){
		
		LocationDao locationdao = new LocationDao();
		List locationList = locationdao.selectAllLocation();
		return locationList;
		
	}
			

}
