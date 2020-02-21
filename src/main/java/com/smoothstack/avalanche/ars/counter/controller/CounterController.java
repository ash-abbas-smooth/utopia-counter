package com.smoothstack.avalanche.ars.counter.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	 * Get Endpoint:  /itineraries
	 * Description: List all itineraries in the db
	 */
	@GetMapping(path = "/itineraries")
	public ResponseEntity<List<Itinerary>> readItineraries() throws NotFoundException {
		return null;
	}
	/*
	 * Post Endpoint: /itineraries
	 * Parameters: 
	 * 		-in body:
	 * 			- traveler_id
	 * 			- user_id
	 * 			- agency_id
	 * 			- tickets
	 * Description: Create an itinerary
	 */
	@PostMapping(path = "/itineraries")
	public ResponseEntity<Itinerary> createItinerary(@Valid @RequestBody Itinerary itinerary){
		return null;
	}
	
	/*
	 * Get Endpoint: /itineraries/{itinerary_id}
	 * Parameters: -in path - itinerary id : the itinerary path
	 * 
	 */
	@GetMapping(path = "/itineraries/{itinerary_id}")
	public ResponseEntity<Itinerary> readItineraryById(@Valid @PathVariable("itinerary_id") Long id) throws NotFoundException {
		return null;
	}
	
	/*
	 * Delete Endpoint : /itineraries/{itinerary_id}
	 * Parameters: -in path - itinerary id : the itinerary path
	 * Description: only set all the tickets to cancelled and handle refund api
	 */
	@DeleteMapping(path = "/itineraries/{itinerary_id}")
	public ResponseEntity<Itinerary> deleteItineraryById(@Valid @PathVariable("itinerary_id") Long id) throws NotFoundException {
		return null;
	}
	
	/*
	 * Get Endpoint: /itineraries/travelers/{traveler_id}
	 * Parameters: 
	 * 	-in path:
	 * 		-traveler_id
	 * Description: get itineraries of the traveler
	 */
	@GetMapping(path = "/itineraries/travelers/{traveler_id}")
	public ResponseEntity<List<Itinerary>> readItinerariesByTraveler(@Valid @PathVariable("traveler_id") Long id) throws NotFoundException {
		return null;
	}
	
	/*
	 * Get Endpoint: /itineraries/tickets/{ticket_id}
	 * Parameters:
	 * 	- in path:
	 * 		-ticket_id
	 * Description: get ticket by the id
	 */
	@GetMapping(path = "/itineraries/tickets/{ticket_id}")
	public ResponseEntity<Ticket> readTicketsById(@Valid @PathVariable("ticket_id") Long id) throws NotFoundException {
		return null;
	}
	
	/*
	 * Get Endpoint:  /travelers
	 * Description: List all travelers in the db
	 */
	@GetMapping(path = "/travelers")
	public ResponseEntity<List<Traveler>> readTravelers() throws NotFoundException {
		return null;
	}
	
	/*
	 * Post Endpoint:  /travelers
	 * Parameters:
	 * 	- in body:
	 * 		- Traveler JSON
	 * Description: Create a traveler
	 */
	@PostMapping(path = "/travelers")
	public ResponseEntity<List<Traveler>> createTravelers(@Valid @RequestBody Traveler traveler) throws NotFoundException {
		return null;
	}
	
	/*
	 * Get Endpoint:  /travelers/search
	 * Description: List all travelers fulfilling the params
	 */
	@GetMapping(path = "/travelers/search")
	public ResponseEntity<List<Traveler>> readTravelersByParams(@Valid @RequestBody Traveler traveler) throws NotFoundException {
		return null;
	}
	
	@GetMapping(path = "/flights/search")
	public ResponseEntity<List<Flight>> readFlightsByParams(@Valid @RequestBody Flight flight) throws NotFoundException {
		return null;
	}
	
}

