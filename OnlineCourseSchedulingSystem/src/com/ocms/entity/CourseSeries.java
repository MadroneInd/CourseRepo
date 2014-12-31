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
@Table(name = "course_series")
public class CourseSeries  implements Serializable{

       
	private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="course_course_id_seq")
        @SequenceGenerator(name="course_course_id_seq", sequenceName="course_course_id_seq", allocationSize=1)
        @Column(name="course_series_id")
        private int id; 

        @Column(name="course_code")
        private String courseCode;

        @Column(name="location_code")
        private String locationCode;
        
        @Column(name="course_id")
        private int courseId;
        
        @Column(name="location_id")
        private int locationId;

        @Column(name="course_series_composite_id")
        private String courseSeriesCompositeId;
        
        @Column(name="type")
        private String type; 

        @Column(name="value_count")
        private int valueCount;
        
        @Column(name="publishing_status")
        private String pubStatus;

        @Column(name="start_date")
        private Date startDate;
        
        @Column(name="end_date")
        private Date endDate;
        
        @Column(name="max_no_of_student_reg")
        private int maxNoOfStuReg;
        
        @Column(name="short_name")
        private String shortName;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCourseCode() {
			return courseCode;
		}

		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}

		public String getLocationCode() {
			return locationCode;
		}

		public void setLocationCode(String locationCode) {
			this.locationCode = locationCode;
		}

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public int getLocationId() {
			return locationId;
		}

		public void setLocationId(int locationId) {
			this.locationId = locationId;
		}

		public String getCourseSeriesCompositeId() {
			return courseSeriesCompositeId;
		}

		public void setCourseSeriesCompositeId(String courseSeriesCompositeId) {
			this.courseSeriesCompositeId = courseSeriesCompositeId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getValueCount() {
			return valueCount;
		}

		public void setValueCount(int valueCount) {
			this.valueCount = valueCount;
		}

		public String getPubStatus() {
			return pubStatus;
		}

		public void setPubStatus(String pubStatus) {
			this.pubStatus = pubStatus;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public int getMaxNoOfStuReg() {
			return maxNoOfStuReg;
		}

		public void setMaxNoOfStuReg(int maxNoOfStuReg) {
			this.maxNoOfStuReg = maxNoOfStuReg;
		}

		public String getShortName() {
			return shortName;
		}

		public void setShortName(String shortName) {
			this.shortName = shortName;
		} 
               
}