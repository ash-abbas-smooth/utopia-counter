package com.smoothstack.avalanche.ars.counter.dto;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.smoothstack.avalanche.ars.counter.entity.Ticket;
import com.smoothstack.avalanche.ars.counter.entity.TravelAgency;
import com.smoothstack.avalanche.ars.counter.entity.Traveler;
import com.smoothstack.avalanche.ars.counter.entity.User;

public class ItineraryDTO {

	private Long id;
	private User user;
	private TravelAgency agency;
	private Traveler traveler;
	private List<Ticket> tickets;
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	private String date_created;
	
	public ItineraryDTO() {}
	/**
	 * @param id
	 * @param user
	 * @param agency
	 * @param traveler
	 * @param tickets
	 * @param date_created
	 */
	public ItineraryDTO(Long id, User user, TravelAgency agency, Traveler traveler, List<Ticket> tickets,
			String date_created) {
		super();
		this.id = id;
		this.user = user;
		this.agency = agency;
		this.traveler = traveler;
		this.tickets = tickets;
		this.date_created = date_created;
	}
	/*
	 * GET CURRENT DATE
	 */

	public Date getSubmissionDateConverted(String timezone) throws java.text.ParseException {
		dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
		return dateFormat.parse(this.date_created);
	}
	public void setSubmissionDate(Date date, String timezone) {
		dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
		this.date_created = dateFormat.format(date_created);
	}
	
	//GETTERS
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @return the agency
	 */
	public TravelAgency getAgency() {
		return agency;
	}
	/**
	 * @return the traveler
	 */
	public Traveler getTraveler() {
		return traveler;
	}
	/**
	 * @return the tickets
	 */
	public List<Ticket> getTickets() {
		return tickets;
	}
	//SETTERS
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @param agency the agency to set
	 */
	public void setAgency(TravelAgency agency) {
		this.agency = agency;
	}
	/**
	 * @param traveler the traveler to set
	 */
	public void setTraveler(Traveler traveler) {
		this.traveler = traveler;
	}
	/**
	 * @param tickets the tickets to set
	 */
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
}
