package com.smoothstack.avalanche.ars.counter.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.avalanche.ars.counter.dao.FlightDAO;
import com.smoothstack.avalanche.ars.counter.dao.ItineraryDAO;
import com.smoothstack.avalanche.ars.counter.dao.TicketDAO;
import com.smoothstack.avalanche.ars.counter.dao.TravelerDAO;
import com.smoothstack.avalanche.ars.counter.entity.Itinerary;
import com.smoothstack.avalanche.ars.counter.entity.Ticket;
import com.smoothstack.avalanche.ars.counter.entity.Traveler;

import javassist.NotFoundException;

@Service
@Transactional
public class CounterService {

	@Autowired
	private ItineraryDAO itineraryDAO;
	
	@Autowired
	private TicketDAO ticketDAO;
	
	@Autowired 
	private TravelerDAO travelerDAO;
	
	@Autowired
	private FlightDAO flightDAO;
	
	/*
	 * Function for returning all the itineraries
	 * Used for the endpoint:
	 *	GET: /counter/itineraries
	 */
	public List<Itinerary> readItineraries() throws NotFoundException {
		List<Itinerary> searchItinerary = itineraryDAO.findAll();
		if(searchItinerary.size() <= 0) {
			throw new NotFoundException("No itineraries found!");
		}
		return searchItinerary;
	}
	/*
	 * Function for returning itinerary with certain id
	 */
	public Itinerary readItineraryById(Long id) throws NotFoundException {
		Optional<Itinerary> searchItinerary = itineraryDAO.findById(id);
		if(searchItinerary.isEmpty()) {
			throw new NotFoundException("Itinerary not found with id:" + id);
		}
		return searchItinerary.get();
	}
	/*
	 * Function for returning itineraries from traveler_id
	 */
	public List<Itinerary> readItineraryByTravelerId(Long id) throws NotFoundException {
		List<Itinerary> searchItinerary = itineraryDAO.findItineraryByTravelerId(id);
		if(searchItinerary.size() <= 0) {
			throw new NotFoundException("No itineraries found!");
		}
		return searchItinerary;
	}
	/*
	 * Function for creating itinerary
	 * Used for the endpoint:
	 * POST: /counter/itineraries
	 */
	public void createItinerary(Itinerary itinerary) throws IllegalArgumentException{
		if(itinerary == null || itinerary.getId() == 0) {
			throw new IllegalArgumentException("Inproper Input");
		}
		Optional<Itinerary> searchItinerary = itineraryDAO.findById(itinerary.getId());
		if(searchItinerary.isPresent()) {
			throw new IllegalArgumentException("Itinerary already exist with Id:" + itinerary.getId());
		}
		itineraryDAO.save(itinerary);
	}
	
	/*
	 * Function for cancelling tickets in itinerary
	 */
	public void cancelItinerary(Long id) throws IllegalArgumentException{
		if(id == 0)
			throw new IllegalArgumentException("Inproper Input");
		Optional<Itinerary> searchItinerary = itineraryDAO.findById(id);
		if(searchItinerary.isPresent()) {
			List<Ticket> tickets = searchItinerary.get().getTickets();
			tickets.forEach(ticket -> {
				ticket.setStatus("CANCELLED");
				ticketDAO.save(ticket);
				});
		}
	}
	/*
	 * Function for getting a specific ticket
	 */
	public Ticket readTickets(Long id) throws IllegalArgumentException{
		if(id == 0)
			throw new IllegalArgumentException("Inproper Input");
		Optional<Ticket> searchTicket = ticketDAO.findById(id);
		if(searchTicket.isEmpty()) {
			throw new IllegalArgumentException("Ticket with id does not exist. Id:" + id);
		}
		return searchTicket.get();
	}
	/*
	 * Function for getting list of travelers
	 */
	public List<Traveler> readTravelers() throws NotFoundException {
		List<Traveler> searchTraveler = travelerDAO.findAll();
		if(searchTraveler.size() <= 0) {
			throw new NotFoundException("No itineraries found!");
		}
		return searchTraveler;
	}
	/*
	 * Function for creating traveler
	 */
	public void createTraveler(Traveler traveler) throws IllegalArgumentException{
		if(traveler == null || traveler.getId() == 0) {
			throw new IllegalArgumentException("Inproper Input");
		}
		Optional<Traveler> searchTraveler = travelerDAO.findById(traveler.getId());
		if(searchTraveler.isPresent()) {
			throw new IllegalArgumentException("Traveler already exist with Id:" + traveler.getId());
		}
		travelerDAO.save(traveler);
	}
	
	/*
	 * Function for searching for travelers fulfilling params
	 */
	public List<Traveler> searchTravelersByParam(){
		return null;
	}
}
