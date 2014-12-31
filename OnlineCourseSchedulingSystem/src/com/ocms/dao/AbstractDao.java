package com.ocms.dao;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ocms.entity.Course;
import com.ocms.entity.IEntity;
import com.ocms.entity.Location;
import com.ocms.helper.HibernateUtil;

public abstract class AbstractDao {
	final Log LOG = LogFactory.getLog(CourseDao.class);
	Session session = null;
	int rs= 0;
	int Id = 0;
	
	public void initSession(){
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
	}
	
	public void commitSession(){
		
        session.getTransaction().commit();
        
    }
	
	public int insertDetails(IEntity obj) throws IOException{
		
		
		rs= (int)session.save(obj);
		return rs;
		
	}
	
public void updateDetails(IEntity obj) throws IOException{
		
		
		session.update(obj);
		
	}
	
    public void deleteDetails(IEntity obj){
		
    	session.delete(obj);
		
	}
    
    @SuppressWarnings("rawtypes")
	public List selectDetails(IEntity obj, String qry){
		
		Id = obj.getId(); 
		LOG.info("AbstractDaoID: "+Id);
		Query query = session.createQuery(qry).setParameter(0, Id);
		List list = query.list();
		LOG.info("AbstractDao: "+list);
		return list;
        
	}
    
    @SuppressWarnings("rawtypes")
   	public List selectAllDetails(String qry){
   		 		 
   		Query query = session.createQuery(qry);
   		List list = query.list();
   		LOG.info("AbstractDao: "+list);
   		return list;
           
   	}
}
