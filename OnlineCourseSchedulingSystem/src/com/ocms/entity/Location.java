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
@Table(name = "location")
public class Location  implements Serializable,IEntity{

       
	private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="location_location_id_seq")
        @SequenceGenerator(name="location_location_id_seq", sequenceName="location_location_id_seq", allocationSize=1)
        @Column(name="location_id")
        private int id; 

        @Column(name="location_code")
        private String Code;

        @Column(name="location_name")
        private String Name;
        
        @Column(name="location_notes")
        private String notes;
        
        @Column(name="site_url")
        private String site_url;
        
        @Column(name="address_line1")
        private String address_line1;
        
        @Column(name="address_line2")
        private String address_line2;
        
        @Column(name="city")
        private String city;
        
        @Column(name="state")
        private String state;
        
        @Column(name="country")
        private String country;
        
        @Column(name="region")
        private String region;
        
        @Column(name="phone")
        private String phone;
        
        @Column(name="fax")
        private String fax;
        
        @Column(name="email")
        private String email;
        
        @Column(name="zip")
        private String zip;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCode() {
			return Code;
		}

		public void setCode(String code) {
			Code = code;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getNotes() {
			return notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}

		public String getSite_url() {
			return site_url;
		}

		public void setSite_url(String site_url) {
			this.site_url = site_url;
		}

		public String getAddress_line1() {
			return address_line1;
		}

		public void setAddress_line1(String address_line1) {
			this.address_line1 = address_line1;
		}

		public String getAddress_line2() {
			return address_line2;
		}

		public void setAddress_line2(String address_line2) {
			this.address_line2 = address_line2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
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

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}    
        
        
}