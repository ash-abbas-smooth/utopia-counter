package com.smoothstack.avalanche.ars.counter.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.avalanche.ars.counter.dao.FlightDAO;
import com.smoothstack.avalanche.ars.counter.dao.ItineraryDAO;
import com.smoothstack.avalanche.ars.counter.dao.TicketDAO;
import com.smoothstack.avalanche.ars.counter.dao.TravelerDAO;
import com.smoothstack.avalanche.ars.counter.dto.ItineraryDTO;
import com.smoothstack.avalanche.ars.counter.entity.Flight;
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
		if(searchItinerary.isEmpty()) {
			throw new NotFoundException("Error: readItineraries(): No itineraries found!");
		}
		return searchItinerary;
	}
	/*
	 * Function for returning itinerary with certain id
	 */
	public Itinerary readItineraryById(Long id) throws NotFoundException {
		Optional<Itinerary> searchItinerary = itineraryDAO.findById(id);
		if(searchItinerary.isPresent()) {
			return searchItinerary.get();
		}
		throw new NotFoundException("Itinerary not found with id:" + id);
	}
	/*
	 * Function for returning itineraries from traveler_id
	 */
	public List<Itinerary> readItineraryByTravelerId(Long id) throws NotFoundException {
		List<Itinerary> searchItinerary = itineraryDAO.findItineraryByTravelerId(id);
		if(searchItinerary.isEmpty()) {
			throw new NotFoundException("Error: readItinerariesByTravelierId: No itineraries found!");
		}
		return searchItinerary;
	}
	
	public void createItinerary(Itinerary itinerary) throws IllegalArgumentException{
		itinerary.setDate_created(LocalDate.now());
		itineraryDAO.save(itinerary);
	}

	
	/*
	 * Function for cancelling tickets in itinerary
	 */
	public void cancelItinerary(Long id) throws IllegalArgumentException{
		if(id == 0)
			throw new IllegalArgumentException("Inproper Input passed: itinerary_id");
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
	public Ticket readTickets(Long id) throws IllegalArgumentException, NotFoundException{
		if(id == 0)
			throw new IllegalArgumentException("Inproper Input passed: ticket_id");
		Optional<Ticket> searchTicket = ticketDAO.findById(id);
		if(searchTicket.isPresent()) {
			return searchTicket.get();
		}
		throw new NotFoundException("Ticket with id does not exist. Id:" + id);
	}
	/*
	 * Function for getting list of travelers
	 */
	public List<Traveler> readTravelers() throws NotFoundException {
		List<Traveler> searchTraveler = travelerDAO.findAll();
		if(searchTraveler.isEmpty()) {
			throw new NotFoundException("No travelers found!");
		}
		return searchTraveler;
	}
	/*
	 * Function for creating traveler
	 */
	public void createTraveler(Traveler traveler) throws IllegalArgumentException{
		if(traveler == null || traveler.getId() == 0) {
			throw new IllegalArgumentException("Inproper Input passed: traveler");
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
	public List<Traveler> searchTravelersByParam(Traveler traveler){
		List<Traveler> searchTraveler = travelerDAO.findAll();
		if(traveler.getFirst_name()!=null){
			searchTraveler = searchTraveler.stream().filter(s -> s.getFirst_name().equals(traveler.getFirst_name())).collect(Collectors.toList());
		}
		if(traveler.getLast_name()!=null) {
			searchTraveler = searchTraveler.stream().filter(s -> s.getLast_name().equals(traveler.getLast_name())).collect(Collectors.toList());
		}
		if(traveler.getCity() != null) {
			searchTraveler = searchTraveler.stream().filter(s -> s.getCity().equals(traveler.getCity())).collect(Collectors.toList());
		}
		if(traveler.getCountry() != null) {
			searchTraveler = searchTraveler.stream().filter(s -> s.getCountry().equals(traveler.getCountry())).collect(Collectors.toList());
		}
		if(traveler.getEmail() != null) {
			searchTraveler = searchTraveler.stream().filter(s -> s.getEmail().equals(traveler.getEmail())).collect(Collectors.toList());
		}
		if(traveler.getStreet() != null) {
			searchTraveler = searchTraveler.stream().filter(s -> s.getStreet().equals(traveler.getStreet())).collect(Collectors.toList());
		}
		if(traveler.getPhone() != null) {
			searchTraveler = searchTraveler.stream().filter(s -> s.getPhone().equals(traveler.getPhone())).collect(Collectors.toList());
		}
		if(traveler.getState() != null) {
			searchTraveler = searchTraveler.stream().filter(s -> s.getState().equals(traveler.getState())).collect(Collectors.toList());
		}
		if(traveler.getPostal_code() != null) {
			searchTraveler = searchTraveler.stream().filter(s -> s.getPostal_code().equals(traveler.getState())).collect(Collectors.toList());
		}
		return searchTraveler;
	}
	public List<Flight> searchFlightsByParam(Flight flight){
		List<Flight> searchFlight = flightDAO.findAll();
		if(flight.getArrival_date() != null){
			searchFlight = searchFlight.stream().filter(s -> s.getArrival_date().equals(flight.getArrival_date())).collect(Collectors.toList());
		}
		if(flight.getCapacity() != 0) {
			searchFlight = searchFlight.stream().filter(s -> s.getCapacity() == flight.getCapacity()).collect(Collectors.toList());
		}
		if(flight.getDeparture_date() != null) {
			searchFlight = searchFlight.stream().filter(s -> s.getDeparture_date().equals(flight.getDeparture_date())).collect(Collectors.toList());
		}
		if(flight.getDest_airport() != null) {
			searchFlight = searchFlight.stream().filter(s -> s.getDest_airport().getId().equals(flight.getDest_airport().getId())).collect(Collectors.toList());
		}
		if(flight.getOrigin_airport() != null) {
			searchFlight = searchFlight.stream().filter(s -> s.getOrigin_airport().getId().equals(flight.getDest_airport().getId())).collect(Collectors.toList());
		}
		if(flight.getPrice() != 0) {
			searchFlight = searchFlight.stream().filter(s -> s.getPrice() < flight.getPrice()).collect(Collectors.toList());
		}
		return searchFlight;
	}
}
