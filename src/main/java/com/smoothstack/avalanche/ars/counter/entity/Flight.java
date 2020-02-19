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
	
	/*
	 * OVERRIDE OBJECT METHODS
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrival_date == null) ? 0 : arrival_date.hashCode());
		result = prime * result + capacity;
		result = prime * result + ((departure_date == null) ? 0 : departure_date.hashCode());
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Flight other = (Flight) obj;
		if (arrival_date == null) {
			if (other.arrival_date != null)
				return false;
		} else if (!arrival_date.equals(other.arrival_date))
			return false;
		if (capacity != other.capacity)
			return false;
		if (departure_date == null) {
			if (other.departure_date != null)
				return false;
		} else if (!departure_date.equals(other.departure_date))
			return false;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	
}
