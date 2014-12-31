package com.ocms.controller;


import com.ocms.entity.Event;
import com.ocms.service.EventService;
import com.ocms.service.EventServiceImpl;

public class EventController {
	
public int createEvent(Event event){
		
	EventService cs = new EventServiceImpl();
		int eventId = cs.createEvent(event);
		return eventId;
		
		}

}
