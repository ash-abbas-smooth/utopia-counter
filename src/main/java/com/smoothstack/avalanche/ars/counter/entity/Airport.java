package com.smoothstack.avalanche.ars.counter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {

	/*
	 * FIELDS
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
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
	 * ENTITY RELATIONSHIP
	 */

	/*
	 * CONSTRUCTORS
	 */
	public Airport() {}
	
	/**
	 * @param id
	 * @param name
	 * @param street
	 * @param country
	 * @param state
	 * @param city
	 * @param postal_cude
	 */
	public Airport(Long id, String name, String street, String country, String state, String city, String postal_cude) {
		super();
		this.id = id;
		this.name = name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
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
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	

}
