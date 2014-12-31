package com.ocms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event implements Serializable, IEntity {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="event_event_id_seq")
    @SequenceGenerator(name="event_event_id_seq", sequenceName="event_event_id_seq", allocationSize=1)
    @Column(name="event_id")
    private int id;
    
    @Column(name="course_code")
    private String code;
    
    @Column(name="event_name")
    private String name;
    
    @Column(name="event_start_date")
    private Date evStrDate;    
    
    @Column(name="event_status")
    private String evStatus;
    
    @Column(name="short_name")
    private String sName;
    
    @Column(name="publishing_status")
    private String evPubStatus;
    
    @Column(name="registration_status")
    private String evRegStatus;
    
    @Column(name="type")
    private String type;
    
    @Column(name="location_code")
    private String locationCode;
    
    @Column(name="max_no_of_reg_student")
    private int maxNoRegStudent;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEvStrDate() {
		return evStrDate;
	}

	public void setEvStrDate(Date evStrDate) {
		this.evStrDate = evStrDate;
	}

	public String getEvStatus() {
		return evStatus;
	}

	public void setEvStatus(String evStatus) {
		this.evStatus = evStatus;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getEvPubStatus() {
		return evPubStatus;
	}

	public void setEvPubStatus(String evPubStatus) {
		this.evPubStatus = evPubStatus;
	}

	public String getEvRegStatus() {
		return evRegStatus;
	}

	public void setEvRegStatus(String evRegStatus) {
		this.evRegStatus = evRegStatus;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public int getMaxNoRegStudent() {
		return maxNoRegStudent;
	}

	public void setMaxNoRegStudent(int maxNoRegStudent) {
		this.maxNoRegStudent = maxNoRegStudent;
	}

}
