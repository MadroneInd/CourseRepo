package com.ocms.service;

import java.io.IOException;
import java.util.List;

import com.ocms.entity.Location;
import com.ocms.entity.LocationContact;

public interface LocationService {
	
	public Location createLocation(Location location, LocationContact locationContact,LocationContact slocationContact);
	public void deleteLocation(Location location);
	public Location updateLocation(Location location, LocationContact locationContact,LocationContact slocationContact) throws IOException;
	public Location selectLocation(Location location);
	@SuppressWarnings("rawtypes")
	public List selectAllLocation();


}