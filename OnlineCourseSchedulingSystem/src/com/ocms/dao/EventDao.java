package com.ocms.dao;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ocms.entity.Event;

public class EventDao extends AbstractDao {
	
final Log LOG = LogFactory.getLog(CourseDao.class);
	
	public int createEvent(Event event) throws IOException{
		
		int eventId=0;
		
		initSession();
		eventId=insertDetails(event);
		commitSession();
        return eventId;
		
	}

}
