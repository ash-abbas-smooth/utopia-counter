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
		
		
}
