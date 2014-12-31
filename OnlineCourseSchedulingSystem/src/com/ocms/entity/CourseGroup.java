package com.ocms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "course_group")
public class CourseGroup {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="course_group_id_seq")
    @SequenceGenerator(name="course_group_id_seq", sequenceName="course_group_id_seq", allocationSize=1)
    @Column(name="id")
    private int id; 

    @Column(name="group_name")
    private String groupName;

    @Column(name="group_type")
    private String type;
    
    @Column(name="course_code")
    private String courseCode;
    
    @Column(name="repetition_no")
    private int repitionNo;
    
    @Column(name="count")
    private int count;
    
    
    @Column(name=" composite_group_id")
    private String  compositeGroupId;
   

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getRepitionNo() {
		return repitionNo;
	}

	public void setRepitionNo(int repitionNo) {
		this.repitionNo = repitionNo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCompositeGroupId() {
		return compositeGroupId;
	}

	public void setCompositeGroupId(String compositeGroupId) {
		this.compositeGroupId = compositeGroupId;
	}

}
