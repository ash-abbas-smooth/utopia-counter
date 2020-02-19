package com.smoothstack.avalanche.ars.counter.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

		/*
		 * FIELDS
		 */
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "role")
		private String role;
		
		@Column(name = "agency_id")
		private Long agency_id;
		
		@Column(name = "first_name")
		private String first_name;
		
		@Column(name = "last_name")
		private String last_name;
		
		@Column(name = "dob")
		private Date dob;
		
		@Column(name = "phone")
		private String phone;

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
		 * CONSTRUCTOR
		 */
		public User() {}
		/**
		 * @param id
		 * @param email
		 * @param password
		 * @param role
		 * @param agency_id
		 * @param first_name
		 * @param last_name
		 * @param dob
		 * @param phone
		 * @param street
		 * @param country
		 * @param state
		 * @param city
		 * @param postal_cude
		 */
		public User(Long id, String email, String password, String role, Long agency_id, String first_name,
				String last_name, Date dob, String phone, String street, String country, String state, String city,
				String postal_cude) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
			this.role = role;
			this.agency_id = agency_id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.dob = dob;
			this.phone = phone;
			this.street = street;
			this.country = country;
			this.state = state;
			this.city = city;
			this.postal_cude = postal_cude;
		}
		
		/*
		 * GETTERS
		 */
		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @return the password
		 */
		public String getPassword() {
			return password;
		}
		/**
		 * @return the role
		 */
		public String getRole() {
			return role;
		}
		/**
		 * @return the agency_id
		 */
		public Long getAgency_id() {
			return agency_id;
		}
		/**
		 * @return the first_name
		 */
		public String getFirst_name() {
			return first_name;
		}
		/**
		 * @return the last_name
		 */
		public String getLast_name() {
			return last_name;
		}
		/**
		 * @return the dob
		 */
		public Date getDob() {
			return dob;
		}
		/**
		 * @return the phone
		 */
		public String getPhone() {
			return phone;
		}
		/**
		 * @return the street
		 */
		public String getStreet() {
			return street;
		}
		/**
		 * @return the country
		 */
		public String getCountry() {
			return country;
		}
		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}
		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}
		/**
		 * @return the postal_cude
		 */
		public String getPostal_cude() {
			return postal_cude;
		}
		
		/*
		 * SETTERS	
		 */
		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * @param password the password to set
		 */
		public void setPassword(String password) {
			this.password = password;
		}
		/**
		 * @param role the role to set
		 */
		public void setRole(String role) {
			this.role = role;
		}
		/**
		 * @param agency_id the agency_id to set
		 */
		public void setAgency_id(Long agency_id) {
			this.agency_id = agency_id;
		}
		/**
		 * @param first_name the first_name to set
		 */
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		/**
		 * @param last_name the last_name to set
		 */
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		/**
		 * @param dob the dob to set
		 */
		public void setDob(Date dob) {
			this.dob = dob;
		}
		/**
		 * @param phone the phone to set
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}
		/**
		 * @param street the street to set
		 */
		public void setStreet(String street) {
			this.street = street;
		}
		/**
		 * @param country the country to set
		 */
		public void setCountry(String country) {
			this.country = country;
		}
		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}
		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
		/**
		 * @param postal_cude the postal_cude to set
		 */
		public void setPostal_cude(String postal_cude) {
			this.postal_cude = postal_cude;
		}
		
		/*
		 * OVERRIDE OBJECT METHODS
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((agency_id == null) ? 0 : agency_id.hashCode());
			result = prime * result + ((city == null) ? 0 : city.hashCode());
			result = prime * result + ((country == null) ? 0 : country.hashCode());
			result = prime * result + ((dob == null) ? 0 : dob.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((phone == null) ? 0 : phone.hashCode());
			result = prime * result + ((postal_cude == null) ? 0 : postal_cude.hashCode());
			result = prime * result + ((role == null) ? 0 : role.hashCode());
			result = prime * result + ((state == null) ? 0 : state.hashCode());
			result = prime * result + ((street == null) ? 0 : street.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (agency_id == null) {
				if (other.agency_id != null)
					return false;
			} else if (!agency_id.equals(other.agency_id))
				return false;
			if (city == null) {
				if (other.city != null)
					return false;
			} else if (!city.equals(other.city))
				return false;
			if (country == null) {
				if (other.country != null)
					return false;
			} else if (!country.equals(other.country))
				return false;
			if (dob == null) {
				if (other.dob != null)
					return false;
			} else if (!dob.equals(other.dob))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (first_name == null) {
				if (other.first_name != null)
					return false;
			} else if (!first_name.equals(other.first_name))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (last_name == null) {
				if (other.last_name != null)
					return false;
			} else if (!last_name.equals(other.last_name))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (phone == null) {
				if (other.phone != null)
					return false;
			} else if (!phone.equals(other.phone))
				return false;
			if (postal_cude == null) {
				if (other.postal_cude != null)
					return false;
			} else if (!postal_cude.equals(other.postal_cude))
				return false;
			if (role == null) {
				if (other.role != null)
					return false;
			} else if (!role.equals(other.role))
				return false;
			if (state == null) {
				if (other.state != null)
					return false;
			} else if (!state.equals(other.state))
				return false;
			if (street == null) {
				if (other.street != null)
					return false;
			} else if (!street.equals(other.street))
				return false;
			return true;
		}
		
		
}
