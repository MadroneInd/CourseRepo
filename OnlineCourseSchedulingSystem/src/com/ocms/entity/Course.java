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
@Table(name = "course")
public  class Course  implements Serializable, IEntity{

       
	private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="course_course_id_seq")
        @SequenceGenerator(name="course_course_id_seq", sequenceName="course_course_id_seq", allocationSize=1)
        @Column(name="course_id")
        private int id; 

        @Column(name="course_code")
        private String code;

        @Column(name="course_name")
        private String name;
        
        @Column(name="course_duration")
        private String duration;    
        
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

		public String getDuration() {
                return duration;
        }

        public void setDuration(String duration) {
                this.duration = duration;
        }
}