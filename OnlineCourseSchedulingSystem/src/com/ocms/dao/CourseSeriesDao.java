package com.ocms.dao;

import java.io.IOException;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ocms.entity.Course;
import com.ocms.entity.CourseSeries;
import com.ocms.entity.Event;
import com.ocms.helper.HibernateUtil;

public class CourseSeriesDao extends AbstractDao  {
	final Log LOG = LogFactory.getLog(CourseSeriesDao.class);
	
public String courseSeriesCreate(String[] courseListArray, String[] locationListArray) throws IOException, SQLException{
		
		int count=0;
		Integer countInteger=0;
		
		LOG.info("Entering Dao");
		LOG.info("CourseSeriesDaoID: "+courseListArray);
		LOG.info("CourseSeriesDaoID: "+locationListArray);
		initSession();
		for (String locationCode: locationListArray)
	    {           
			LOG.info("locationCode"+locationCode);
			Query query = session.createQuery("select max(cs.valueCount) from CourseSeries as cs where locationCode = '"+locationCode+"'");
			 countInteger =  (Integer)query.uniqueResult() ;
			 LOG.info("CourseSeriesDaoIDCount: "+count);
			 
			 if(countInteger != null){
				
				 count=countInteger+01;
			 }else{
				 count=01;		 
			 }
			
			for (String courseCode: courseListArray)
		    {           
				LOG.info("courseCode"+courseCode);
				 CourseSeries courseSeries = new CourseSeries();
	             courseSeries.setCourseCode(courseCode);
	             courseSeries.setLocationCode(locationCode);
	             courseSeries.setValueCount(count);
	             courseSeries.setCourseSeriesTitle(locationCode +"-Series-"+ count );
	             courseSeries.setCourseTitle(courseCode +"."+ locationCode +"-Series-"+ count);
	             Serializable rs= session.save(courseSeries); 
				
		    }
	    }
		commitSession();
        count=0;
        return "Success";
   }
   
   @SuppressWarnings("rawtypes")
   public List courseSeriesSelect(CourseSeries courseSeries) throws IOException{
	   
	   String courseSeriesId = null;
	   initSession();
	   courseSeriesId= courseSeries.getCourseSeriesTitle();
	   LOG.info("CourseSeriesDaoID: "+courseSeriesId);
	   Query query = session.createQuery("from CourseSeries where courseSeriesCompositeId = ? ").setParameter(0, courseSeriesId);
	   List list = query.list();
	   LOG.info("CourseSeriesDaoID: "+list);
	   commitSession();
       return list;
	   
   }

   @SuppressWarnings({ "rawtypes", "unchecked" })
   public int courseSeriesPublish(CourseSeries courseSeries) throws IOException{
	   
	   int eventId = 0;
	  	   
	   List list = courseSeriesSelect(courseSeries);
	   Iterator<CourseSeries> it1 = list.iterator();
	   while(it1.hasNext()) {
		   
		   CourseSeries courseSeriesInsrt = new CourseSeries();
		   courseSeriesInsrt = it1.next();
		   Event event = new Event();
		   event.setCode(courseSeriesInsrt.getCourseCode());
		   event.setLocationCode(courseSeriesInsrt.getLocationCode());
		   event.setEvPubStatus(courseSeriesInsrt.getPubStatus());
		   event.setEvRegStatus("Open");
		   event.setsName(courseSeriesInsrt.getShortName());
		   event.setMaxNoRegStudent(courseSeriesInsrt.getMaxNoOfStuReg());
		   EventDao eventDao = new EventDao();
		   eventId = eventDao.createEvent(event);
		   
	   }
	   return eventId;
	   
    }

   
   @SuppressWarnings({ "rawtypes", "unchecked" })
	public List selectAllCourseSeries(){
	
		initSession();
		Query query = session.createQuery("select distinct courseSeriesTitle from CourseSeries");
		List courseSeriesList = query.list();
		commitSession();
		LOG.info("CourseSeriesDao: "+courseSeriesList);
       return courseSeriesList;
       
	}
   
   @SuppressWarnings({ "rawtypes", "unchecked" })
	public List selectCourseSeries(CourseSeries courseSeries){
	   
	    String courseSeriesTitle=null;
	    
	
		initSession();
		courseSeriesTitle=courseSeries.getCourseTitle();
		Query query = session.createQuery("from CourseSeries where courseSeriesTitle = ?").setParameter(0, courseSeriesTitle);
		List<CourseSeries> courseSeriesList = query.list();
		commitSession();
		LOG.info("CourseSeriesDao: "+courseSeriesList);
        return courseSeriesList;
      
	}
   
   @SuppressWarnings("null")
public ArrayList<String> courseSeriesPreview(String[] courseListArray, String[] locationListArray) throws IOException, SQLException{
		
	   ArrayList<String> courseSeriesDetails= new ArrayList<String>();
	   String title=null;
		
		LOG.info("Entering Dao");
		LOG.info("CourseSeriesDaoID: "+courseListArray);
		LOG.info("CourseSeriesDaoID: "+locationListArray);
		
		
		for (String locationCode: locationListArray)
	    {           
			LOG.info("locationCode"+locationCode);
			for (String courseCode: courseListArray)
		    {           
				LOG.info("courseCode"+courseCode);
				title = courseCode+"."+locationCode;
				courseSeriesDetails.add(title);
				LOG.info("courseSeriesDetails:"+courseSeriesDetails);
				
		    }
	    }
		
       return courseSeriesDetails;
  }

}
