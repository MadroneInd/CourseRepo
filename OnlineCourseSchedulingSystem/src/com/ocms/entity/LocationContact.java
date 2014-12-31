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
@Table(name = "location_contact")
public  class LocationContact  implements Serializable, IEntity{

       
	private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="location_contact_location_contact_id_seq")
        @SequenceGenerator(name="location_contact_location_contact_id_seq", sequenceName="location_contact_location_contact_id_seq", allocationSize=1)
	    @Column(name="location_contact_id")
        private int id;
	    
	    @Column(name="location_id")
        private int locationId; 

        @Column(name="contact_name")
        private String name;

        @Column(name="contact_title")
        private String title;
        
        @Column(name="contact_type")
        private String type;
        
        @Column(name="phone")
        private String phone;
        
        @Column(name="fax")
        private String fax;
        
        @Column(name="email")
        private String email;

		public int getId() {
			return id;
		}

		public void setId(int locationContactId) {
			this.id = locationContactId;
		}

		public int getLocationId() {
			return locationId;
		}

		public void setLocation_id(int locationId) {
			this.locationId = locationId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getFax() {
			return fax;
		}

		public void setFax(String fax) {
			this.fax = fax;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		    
        
        
}