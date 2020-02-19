package com.smoothstack.avalanche.ars.counter.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traveler")
public class Traveler {

		/*
		 * FIELDS
		 */
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "first_name")
		private String first_name;
		
		@Column(name = "last_name")
		private String last_name;
		
		@Column(name = "dob")
		private Date dob;
		
		@Column(name = "phone")
		private String phone;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "street")
		private String street;
		
		@Column(name = "country")
		private String country;
		
		@Column(name = "state")
		private String state;
		
		@Column(name = "city")
		private String city;
		
		@Column(name = "postal_code")
		private String postal_cude;

		/*
		 * ENTITY RELATIONSHIPS
		 */
		
		/*
		 * CONSTRUCTORS
		 */
		
		public Traveler()
		{
			
		}
		
		public Traveler(Long id, String first_name, String last_name, Date dob, String phone, String email,
				String street, String country, String state, String city, String postal_cude) {
			super();
			this.id = id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.dob = dob;
			this.phone = phone;
			this.email = email;
			this.street = street;
			this.country = country;
			this.state = state;
			this.city = city;
			this.postal_cude = postal_cude;
		}
		
		/*
		 * GETTERS/SETTERS
		 */
		public Long getId() {
			return id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public Date getDob() {
			return dob;
		}

		public String getPhone() {
			return phone;
		}

		public String getEmail() {
			return email;
		}

		public String getStreet() {
			return street;
		}

		public String getCountry() {
			return country;
		}

		public String getState() {
			return state;
		}

		public String getCity() {
			return city;
		}

		public String getPostal_cude() {
			return postal_cude;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public void setState(String state) {
			this.state = state;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setPostal_cude(String postal_cude) {
			this.postal_cude = postal_cude;
		}
		
		
}
