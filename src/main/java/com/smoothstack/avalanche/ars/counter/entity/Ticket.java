package com.smoothstack.avalanche.ars.counter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	/*
	 * FIELDS
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "flight_number")
	private Long flight_number;
	
	@Column(name = "itinerary_id")
	private Long itinerary_id;
	
	@Column(name = "status")
	private Long status;
	
	@Column(name = "seat_number")
	private String seat_number;

	/*
	 * ENTITY RELATIONSHIPS
	 */
	
	/*
	 * CONSTRUCTORS
	 */
	public Ticket() {}
	/**
	 * @param id
	 * @param flight_number
	 * @param itinerary_id
	 * @param status
	 * @param seat_number
	 */
	public Ticket(Long id, Long flight_number, Long itinerary_id, Long status, String seat_number) {
		super();
		this.id = id;
		this.flight_number = flight_number;
		this.itinerary_id = itinerary_id;
		this.status = status;
		this.seat_number = seat_number;
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
	 * @return the flight_number
	 */
	public Long getFlight_number() {
		return flight_number;
	}
	/**
	 * @return the itinerary_id
	 */
	public Long getItinerary_id() {
		return itinerary_id;
	}
	/**
	 * @return the status
	 */
	public Long getStatus() {
		return status;
	}
	/**
	 * @return the seat_number
	 */
	public String getSeat_number() {
		return seat_number;
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
	 * @param flight_number the flight_number to set
	 */
	public void setFlight_number(Long flight_number) {
		this.flight_number = flight_number;
	}
	/**
	 * @param itinerary_id the itinerary_id to set
	 */
	public void setItinerary_id(Long itinerary_id) {
		this.itinerary_id = itinerary_id;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Long status) {
		this.status = status;
	}
	/**
	 * @param seat_number the seat_number to set
	 */
	public void setSeat_number(String seat_number) {
		this.seat_number = seat_number;
	}
	
}
