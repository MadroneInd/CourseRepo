package com.ocms.dao;

import java.io.IOException;
import java.io.Serializable;
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
public String courseSeriesCreate(List courseList, String locationCode, List repetitionList) throws IOException{
		
		String courseCode = null;
		int count=0;
		int repetitionNo=0;
		int loop=0;
		LOG.info("CourseSeriesDaoID: "+locationCode);
		LOG.info("CourseSeriesDaoID: "+courseList);
		LOG.info("CourseSeriesDaoID: "+repetitionList);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("select max(cs.valueCount) from CourseSeries as cs where locationCode = '"+locationCode+"'");
		count = (int) query.list().get(0);
		LOG.info("CourseSeriesDaoID: "+count);
		Iterator<String> it1 = courseList.iterator();
		Iterator<Integer> it2 = repetitionList.iterator();
		while(it1.hasNext()) {
			courseCode = it1.next();
            repetitionNo = it2.next();
            loop=1;
            while(loop<=repetitionNo || loop==0){
            CourseSeries courseSeries = new CourseSeries();
            courseSeries.setCourseCode(courseCode);
            courseSeries.setLocationCode(locationCode);
            courseSeries.setValueCount(count);
            courseSeries.setCourseSeriesCompositeId(locationCode +" "+ count );
            Serializable rs= session.save(courseSeries); 
            loop=loop+1;
            }
        }
        
        session.getTransaction().commit();
        courseCode = null;
        count=0;
        return "Success";
   }
   
   @SuppressWarnings("rawtypes")
   public List courseSeriesSelect(CourseSeries courseSeries) throws IOException{
	   
	   String courseSeriesId = null;
	   initSession();
	   courseSeriesId= courseSeries.getCourseSeriesCompositeId();
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


}
