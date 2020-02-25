package com.smoothstack.avalanche.ars.counter.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.smoothstack.avalanche.ars.counter.dto.FlightDTO;
import com.smoothstack.avalanche.ars.counter.dto.ItineraryDTO;
import com.smoothstack.avalanche.ars.counter.dto.TravelerDTO;
import com.smoothstack.avalanche.ars.counter.entity.Flight;
import com.smoothstack.avalanche.ars.counter.entity.Itinerary;
import com.smoothstack.avalanche.ars.counter.entity.Ticket;
import com.smoothstack.avalanche.ars.counter.entity.Traveler;
import com.smoothstack.avalanche.ars.counter.service.CounterService;

import javassist.NotFoundException;

@RestController
@RequestMapping("/api/counter")
public class CounterController {

	@Autowired
	CounterService counterService;
	
	/*
	 * Description: List all itineraries in the db
	 */
	@GetMapping(path = "/itineraries")
	public ResponseEntity<List<Itinerary>> readItineraries() throws NotFoundException {
		try{
			List<Itinerary> searchItinerary = counterService.readItineraries();
			return new ResponseEntity<>(searchItinerary, new HttpHeaders(), HttpStatus.OK);
		} catch(NotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
		}
	}
	/*
	 * Parameters: 
	 * 		-in body:
	 * 			- traveler_id
	 * 			- user_id
	 * 			- agency_id
	 * 			- tickets
	 * Description: Create an itinerary
	 */
	@PostMapping(path = "/itineraries")
	public ResponseEntity<Itinerary> createItinerary(@Valid @RequestBody ItineraryDTO itinerary){
		try {
			counterService.createItinerary(itinerary);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch(IllegalArgumentException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}
	
	/*
	 * Parameters: -in path - itinerary id : the itinerary path
	 * 
	 */
	@GetMapping(path = "/itineraries/{itinerary_id}")
	public ResponseEntity<Itinerary> readItineraryById(@Valid @PathVariable("itinerary_id") Long id) throws NotFoundException {
		try {
			Itinerary searchItinerary = counterService.readItineraryById(id);
			return new ResponseEntity<>(searchItinerary, HttpStatus.ACCEPTED);
		
		} catch(IllegalArgumentException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}
	
	/*
	 * Parameters: -in path - itinerary id : the itinerary path
	 * Description: only set all the tickets to cancelled and handle refund api
	 */
	@DeleteMapping(path = "/itineraries/{itinerary_id}")
	public ResponseEntity<Itinerary> deleteItineraryById(@Valid @PathVariable("itinerary_id") Long id) throws NotFoundException {
		try {
			counterService.cancelItinerary(id);
			return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch(IllegalArgumentException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}
	
	/*
	 * Parameters: 
	 * 	-in path:
	 * 		-traveler_id
	 * Description: get itineraries of the traveler
	 */
	@GetMapping(path = "/itineraries/travelers/{traveler_id}")
	public ResponseEntity<List<Itinerary>> readItinerariesByTraveler(@Valid @PathVariable("traveler_id") Long id) throws NotFoundException {
		try {
			List<Itinerary> searchItinerary = counterService.readItineraryByTravelerId(id);
			return new ResponseEntity<>(searchItinerary, new HttpHeaders(), HttpStatus.OK);
		} catch(NotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
		}
	}
	
	/*
	 * Parameters:
	 * 	- in path:
	 * 		-ticket_id
	 * Description: get ticket by the id
	 */
	@GetMapping(path = "/itineraries/tickets/{ticket_id}")
	public ResponseEntity<Ticket> readTicketsById(@Valid @PathVariable("ticket_id") Long id) throws NotFoundException {
		try {
			Ticket searchTicket = counterService.readTickets(id);
			return new ResponseEntity<>(searchTicket, HttpStatus.ACCEPTED);
		} catch(NotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}
	
	/*
	 * Get Endpoint:  /travelers
	 * Description: List all travelers in the db
	 */
	@GetMapping(path = "/travelers")
	public ResponseEntity<List<Traveler>> readTravelers() throws NotFoundException {
		try{
			List<Traveler> searchTraveler = counterService.readTravelers();
			return new ResponseEntity<>(searchTraveler, new HttpHeaders(), HttpStatus.OK);
		} catch(NotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
		}
	}
	
	/*
	 * Post Endpoint:  /travelers
	 * Parameters:
	 * 	- in body:
	 * 		- Traveler JSON
	 * Description: Create a traveler
	 */
	@PostMapping(path = "/travelers")
	public ResponseEntity<Traveler> createTraveler(@Valid @RequestBody TravelerDTO travelerDTO) throws NotFoundException {
		try {
			Traveler traveler = convertToEntity(travelerDTO);
			counterService.createTraveler(traveler);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch(IllegalArgumentException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}
	
	private Traveler convertToEntity(@Valid TravelerDTO travelerDTO) {
		return new Traveler(travelerDTO.getFirst_name(), travelerDTO.getLast_name(),
				travelerDTO.getDob(), travelerDTO.getPhone(), travelerDTO.getEmail(),
				travelerDTO.getStreet(), travelerDTO.getCountry(), travelerDTO.getState(), travelerDTO.getCity(),
				travelerDTO.getPostal_code());
	}
	/*
	 * Get Endpoint:  /travelers/search
	 * Description: List all travelers fulfilling the params
	 */
	@PostMapping(path = "/travelers/search")
	public ResponseEntity<List<Traveler>> readTravelersByParams(@Valid @RequestBody TravelerDTO travelerDTO) {
		Traveler traveler = convertToEntity(travelerDTO);
		List<Traveler> searchTraveler = counterService.searchTravelersByParam(traveler);
		return new ResponseEntity<>(searchTraveler, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping(path = "/flights/search")
	public ResponseEntity<List<Flight>> readFlightsByParams(@Valid @RequestBody FlightDTO flightDTO) throws NotFoundException {
		Flight flight = convertToEntity(flightDTO);
		List<Flight> searchFlight = counterService.searchFlightsByParam(flight);
		return new ResponseEntity<>(searchFlight, new HttpHeaders(), HttpStatus.OK);
	}
	private Flight convertToEntity(@Valid FlightDTO flightDTO) {
		return new Flight(flightDTO.getId(),flightDTO.getCapacity(), flightDTO.getPrice(), flightDTO.getArrival_date(), flightDTO.getDeparture_date());
	}
}

