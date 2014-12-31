package com.ocms.dao;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;

import com.ocms.entity.Location;
import com.ocms.entity.LocationContact;

public class LocationDao extends AbstractDao {
	final Log LOG = LogFactory.getLog(LocationDao.class);
	
	public Location createLocation(Location location, LocationContact locationContact, LocationContact slocationContact) throws IOException{
		
		int locationId;
		initSession();
		locationId= insertDetails(location);
        if(locationId != 0){
        	
        	if(locationContact.getName()!= null || locationContact.getPhone()!= null || locationContact.getEmail()!= null || locationContact.getFax()!= null){
        	 
        	 locationContact.setLocation_id(locationId);
        	 locationContact.setType("Primary");
        	 insertDetails(locationContact);
        	 
        	}
        	
        	if(slocationContact.getName()!= null || slocationContact.getPhone()!= null || slocationContact.getEmail()!= null || slocationContact.getFax()!= null){
             
        	 slocationContact.setLocation_id(locationId);
             slocationContact.setType("Accounting");
             insertDetails(slocationContact);
             
        	}
        	
        }
        commitSession();
        return location;
		
	}
	public void deleteLocation(Location location){
		
		initSession();
		deleteDetails(location);
		commitSession();
	
	}
	public void updateLocation(Location location, LocationContact locationContact, LocationContact slocationContact) throws IOException{
		
		initSession();
		updateDetails(location);
		updateDetails(locationContact);
		updateDetails(slocationContact);
        commitSession();
		
	}
	
	@SuppressWarnings({ "unchecked" })
	public Location selectLocation(Location location){
		
		initSession();   
		List<Location> list = selectDetails(location, "from Location where id = ? ");
		Location locationObj = (Location) list.get(0);
		LOG.info("locationDao: "+locationObj);
		List<LocationContact> listlc = selectDetails(location, "from Location where id = ? ");
		LocationContact locationContactObj = (LocationContact) listlc.get(0);
		commitSession();
		LOG.info("locationDao: "+locationContactObj);
        return locationObj;
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List selectAllLocation(){
		
		initSession();  
		List<Location> locationList = selectAllDetails("from Location");
		LOG.info("LocationDao: "+locationList);
        for (int i = 0; i < locationList.size(); i++) {
            Location location = (Location) locationList.get(i);
            LOG.info("Location["+i+ "]: "+location.getName());
        }
        commitSession();
        return locationList;
       
	}
}
