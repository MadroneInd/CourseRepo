package com.ocms.entity;

import java.io.Serializable;

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

        @Column(name="count")
        private int count;

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

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		} 
        
        
        
        
}