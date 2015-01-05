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
	
@SuppressWarnings({ "unchecked", "rawtypes" })
public String courseSeriesCreate(ArrayList<String> courseList, ArrayList<String> locationList, ArrayList<Integer> repetitionList) throws IOException, SQLException{
		
	    List countList = null;
		int count=0;
		Integer countInteger=0;
		int loop=0;
		int repetitionNo=0;
		String courseCode=null;
		String locationCode=null;
		String locationCodeNext=null;
		
		LOG.info("Entering Dao");
		LOG.info("CourseSeriesDaoID: "+locationList);
		LOG.info("CourseSeriesDaoID: "+courseList);
		LOG.info("CourseSeriesDaoID: "+repetitionList);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Iterator<String> it1 = courseList.iterator();
		Iterator<Integer> it2 = repetitionList.iterator();
		Iterator<String> it3 = locationList.iterator();
		locationCode = it3.next();
		do{
		 Query query = session.createQuery("select max(cs.valueCount) from CourseSeries as cs where locationCode = '"+locationCode+"'");
		 countInteger =  (Integer)query.uniqueResult() ;
		 LOG.info("CourseSeriesDaoIDCount: "+count);
		 
		 if(countInteger != null){
			
			 count=countInteger+01;
		 }else{
			 count=01;		 
		 }
		   do{
			  courseCode = it1.next();
              repetitionNo = 1;
              loop=1;
                while(loop<=repetitionNo){
                CourseSeries courseSeries = new CourseSeries();
                courseSeries.setCourseCode(courseCode);
                courseSeries.setLocationCode(locationCode);
                courseSeries.setValueCount(count);
                courseSeries.setCourseSeriesTitle(locationCode +" Series-"+ count );
                courseSeries.setCourseTitle(courseCode +"."+ locationCode +" Series-"+ count);
                Serializable rs= session.save(courseSeries); 
                loop=loop+1;
                }
             if(it3.hasNext()){ 
               locationCodeNext=it3.next();
               LOG.info("Not Null");
               LOG.info("locationCodeNext:"+locationCodeNext);
               LOG.info("locationCode:"+locationCode);
             }else{
            	 locationCodeNext=null; 
            	 LOG.info("Null");
                 LOG.info("locationCodeNext:"+locationCodeNext);
                 LOG.info("locationCode:"+locationCode);
             }
            }while(locationCode.equals(locationCodeNext));
		 locationCode=locationCodeNext;
		}while(locationCodeNext!=null);
        session.getTransaction().commit();
        courseCode = null;
        locationCode=null;
        count=0;
        loop=0;
        repetitionNo=0;
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

}
