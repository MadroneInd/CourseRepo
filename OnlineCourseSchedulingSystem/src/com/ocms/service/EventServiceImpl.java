package com.ocms.service;

import java.io.IOException;

import com.ocms.dao.EventDao;
import com.ocms.entity.Event;

public class EventServiceImpl implements EventService {

	@Override
	public int createEvent(Event event) {
		
		EventDao eventdao = new EventDao();
		int eventId = 0;
		try {
			eventId = eventdao.createEvent(event);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return eventId;
		
	}

}
