package com.smoothstack.avalanche.ars.counter.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itinerary")
public class Itinerary {

	/*
	 * FIELDS
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "traveler_id")
	private Long traveler_id;
	
	@Column(name = "user_id")
	private Long user_id;
	
	@Column(name = "agency_id")
	private Long agency_id;
	
	@Column(name = "price_total")
	private double price_total;
	
	@Column(name = "date_created")
	private Date date_created;

	/*
	 * ENTITY RELATIONSHIPS
	 */
	
	
	/*
	 * CONSTRUCTOR
	 */
	public Itinerary() {}
	/**
	 * @param id
	 * @param traveler_id
	 * @param user_id
	 * @param agency_id
	 * @param price_total
	 * @param date_created
	 */
	public Itinerary(Long id, Long traveler_id, Long user_id, Long agency_id, double price_total, Date date_created) {
		super();
		this.id = id;
		this.traveler_id = traveler_id;
		this.user_id = user_id;
		this.agency_id = agency_id;
		this.price_total = price_total;
		this.date_created = date_created;
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
	 * @return the traveler_id
	 */
	public Long getTraveler_id() {
		return traveler_id;
	}
	/**
	 * @return the user_id
	 */
	public Long getUser_id() {
		return user_id;
	}
	/**
	 * @return the agency_id
	 */
	public Long getAgency_id() {
		return agency_id;
	}
	/**
	 * @return the price_total
	 */
	public double getPrice_total() {
		return price_total;
	}
	/**
	 * @return the date_created
	 */
	public Date getDate_created() {
		return date_created;
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
	 * @param traveler_id the traveler_id to set
	 */
	public void setTraveler_id(Long traveler_id) {
		this.traveler_id = traveler_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	/**
	 * @param agency_id the agency_id to set
	 */
	public void setAgency_id(Long agency_id) {
		this.agency_id = agency_id;
	}
	/**
	 * @param price_total the price_total to set
	 */
	public void setPrice_total(double price_total) {
		this.price_total = price_total;
	}
	/**
	 * @param date_created the date_created to set
	 */
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	
}
