package com.ocms.dao;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ocms.entity.Course;
import com.ocms.entity.CourseGroup;
import com.ocms.entity.CourseSeries;
import com.ocms.helper.HibernateUtil;

public class CourseGroupDao {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String courseGroupCreate(List courseList, String groupName,  List repetitionList) throws IOException{
			
			String courseCode = null;
			int repetitionNo=0;
			int count=0;
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.getTransaction().begin();
			Query query = session.createQuery("Max(count)from CourseGroup");
			count = query.executeUpdate();
			count = count+1;
			Iterator<String> it1 = courseList.iterator();
			Iterator<Integer> it2 = repetitionList.iterator();
			while(it1.hasNext()) {
	            courseCode = it1.next();
	            repetitionNo = it2.next();
	            CourseGroup courseGroup = new CourseGroup();
	            courseGroup.setGroupName(groupName);
	            courseGroup.setCourseCode(courseCode);
	            courseGroup.setRepitionNo(repetitionNo);
	            courseGroup.setCount(count);
	            courseGroup.setCompositeGroupId(groupName+"-"+count);
	            Serializable rs= session.save(courseGroup); 
	        }
	        
	        session.getTransaction().commit();
	        courseCode = null;
	        count=0;
	        return "Success";
	}
	
	public CourseGroup selectGroup(CourseGroup courseGroup) throws IOException{
			
			String id = null;
			CourseGroup courseGroupList = new CourseGroup();
			id = courseGroup.getCompositeGroupId();
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.getTransaction().begin();
			Query query = session.createQuery("from CourseGroup where compositeGroupId='"+id+"' ");
			courseGroupList = (CourseGroup) query.list();
			session.getTransaction().commit();
	        return courseGroupList;
	}

}
