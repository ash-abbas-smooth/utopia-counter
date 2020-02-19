package com.smoothstack.avalanche.ars.counter.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	/*
	 * FIELDS
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dest")
	private Long dest;
	
	@Column(name = "origin")
	private Long origin;
	
	@Column(name = "capacity")
	private int capacity;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "arrival_date")
	private Date arrival_date;
	
	@Column(name = "departure_date")
	private Date departure_date;

	/*
	 * ENTITY RELATIONSHIPS
	 */
	
	/*
	 * CONSTRUCTORS
	 */
	public Flight() {}
	/**
	 * @param id
	 * @param dest
	 * @param origin
	 * @param capacity
	 * @param price
	 * @param arrival_date
	 * @param departure_date
	 */
	public Flight(Long id, Long dest, Long origin, int capacity, double price, Date arrival_date, Date departure_date) {
		super();
		this.id = id;
		this.dest = dest;
		this.origin = origin;
		this.capacity = capacity;
		this.price = price;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
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
	 * @return the dest
	 */
	public Long getDest() {
		return dest;
	}
	/**
	 * @return the origin
	 */
	public Long getOrigin() {
		return origin;
	}
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the arrival_date
	 */
	public Date getArrival_date() {
		return arrival_date;
	}
	/**
	 * @return the departure_date
	 */
	public Date getDeparture_date() {
		return departure_date;
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
	 * @param dest the dest to set
	 */
	public void setDest(Long dest) {
		this.dest = dest;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(Long origin) {
		this.origin = origin;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param arrival_date the arrival_date to set
	 */
	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}
	/**
	 * @param departure_date the departure_date to set
	 */
	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

	
}
