package com.smoothstack.avalanche.ars.counter.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.avalanche.ars.counter.dao.FlightDAO;
import com.smoothstack.avalanche.ars.counter.dao.ItineraryDAO;
import com.smoothstack.avalanche.ars.counter.dao.TravelerDAO;
import com.smoothstack.avalanche.ars.counter.entity.Itinerary;

import javassist.NotFoundException;

@Service
@Transactional
public class CounterService {

	@Autowired
	private ItineraryDAO itineraryDAO;
	
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
	 * Function for creating itinerary
	 * Used for the endpoint:
	 * POST: /counter/itineraries
	 */
	public void createItinerary(Itinerary itinerary) throws IllegalArgumentException{
		
	}
	
}
