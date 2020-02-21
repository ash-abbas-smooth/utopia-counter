package com.smoothstack.avalanche.ars.counter.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	private TravelAgency agency;
	
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Traveler traveler;
	
	@OneToMany(mappedBy = "itinerary",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Ticket> tickets;
	
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
	
	/*
	 * OVERRIDE OBJECT METHOD
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agency_id == null) ? 0 : agency_id.hashCode());
		result = prime * result + ((date_created == null) ? 0 : date_created.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price_total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((traveler_id == null) ? 0 : traveler_id.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		Itinerary other = (Itinerary) obj;
		if (agency_id == null) {
			if (other.agency_id != null)
				return false;
		} else if (!agency_id.equals(other.agency_id))
			return false;
		if (date_created == null) {
			if (other.date_created != null)
				return false;
		} else if (!date_created.equals(other.date_created))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(price_total) != Double.doubleToLongBits(other.price_total))
			return false;
		if (traveler_id == null) {
			if (other.traveler_id != null)
				return false;
		} else if (!traveler_id.equals(other.traveler_id))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}
	
}
