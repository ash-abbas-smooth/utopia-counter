package com.smoothstack.avalanche.ars.counter;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import com.smoothstack.avalanche.ars.counter.controller.CounterController;
import com.smoothstack.avalanche.ars.counter.dao.AirportDAO;
import com.smoothstack.avalanche.ars.counter.dao.FlightDAO;
import com.smoothstack.avalanche.ars.counter.dao.ItineraryDAO;
import com.smoothstack.avalanche.ars.counter.dao.TicketDAO;
import com.smoothstack.avalanche.ars.counter.dao.TravelerDAO;
import com.smoothstack.avalanche.ars.counter.dao.UserDAO;
import com.smoothstack.avalanche.ars.counter.dto.ItineraryDTO;
import com.smoothstack.avalanche.ars.counter.entity.Airport;
import com.smoothstack.avalanche.ars.counter.entity.Flight;
import com.smoothstack.avalanche.ars.counter.entity.Itinerary;
import com.smoothstack.avalanche.ars.counter.entity.Ticket;
import com.smoothstack.avalanche.ars.counter.entity.Traveler;
import com.smoothstack.avalanche.ars.counter.entity.User;
import com.smoothstack.avalanche.ars.counter.service.CounterService;

import javassist.NotFoundException;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {

	@InjectMocks
	CounterController counterController;
	
	@Mock
	CounterService counterService;
	
	@TestConfiguration
	static class CounterServiceTestContextConfiguration{
		@Bean
		public CounterService counterService() {
			return new CounterService();
		}
	}
	
	@MockBean
	private ItineraryDAO itineraryDAO;
	
	@MockBean
	private AirportDAO airportDAO;
	
	@MockBean
	private TicketDAO ticketDAO;
	
	@MockBean
	private TravelerDAO travelerDAO;
	
	@MockBean
	private UserDAO userDAO;
	
	@MockBean
	private FlightDAO flightDAO;
	
	@BeforeEach
	public void setUp() {
		User user = new User(Long.valueOf(1), "email","pw","TRAVELER", "firstname", "lastname", new Date(1,1,1),"111-111-1111","street","country","state","city","postal");
		Traveler traveler = new Traveler(Long.valueOf(1),"firstname","lastname", new Date(1,1,1),"111-111-1111","email","street","country","state","city","postal_code");
		Traveler traveler2 = new Traveler(Long.valueOf(2),"firstname2","lastname", new Date(1,1,1),"111-111-1111","email","street","country","state","city","postal_code"); 
		Airport airport1 = new Airport(Long.valueOf(1), "name1", "street1","country1","state1","city1","postalcode1");
		Airport airport2 = new Airport(Long.valueOf(2), "name2", "street2","country2","state2","city2","postalcode2");
		Flight flight = new Flight(Long.valueOf(1), 10, 10, new Date(2,2,2), new Date(1,1,1));
		Ticket ticket = new Ticket(Long.valueOf(1),"ACTIVE", "1A");
		List<Ticket> tickets = new ArrayList<>();
		tickets.add(ticket);
		Itinerary itinerary = new Itinerary(Long.valueOf(1),10, LocalDate.now(), null, user,traveler, tickets);
		Itinerary itinerary2 = new Itinerary(Long.valueOf(2),10, LocalDate.now(), null, user,traveler, tickets);
		List<Itinerary> itineraries = new ArrayList<Itinerary>();
		List<Itinerary> itineraries2 = new ArrayList<Itinerary>();
		itineraries.add(itinerary);
		itineraries2.add(itinerary2);
		List<Traveler> travelers = new ArrayList<Traveler>();
		travelers.add(traveler);
		travelers.add(traveler2);
		List<Flight> flights = new ArrayList<Flight>();
		flights.add(flight);
		Mockito.when(itineraryDAO.findAll()).thenReturn(itineraries);
		Mockito.when(itineraryDAO.findById(Long.valueOf(1))).thenReturn(Optional.of(itinerary));
		Mockito.when(itineraryDAO.findItineraryByTravelerId(Long.valueOf(2))).thenReturn(itineraries2);
		Mockito.when(itineraryDAO.save(itinerary)).thenReturn(itinerary);
		Mockito.when(ticketDAO.findById(Long.valueOf(1))).thenReturn(Optional.of(ticket));
		Mockito.when(travelerDAO.findAll()).thenReturn(travelers);
		Mockito.when(flightDAO.findAll()).thenReturn(flights);
	}
	
	@Test
	public void testReadItineraries() throws NotFoundException {
		ResponseEntity<List<Itinerary>> testItineraries = counterController.readItineraries();
		assertEquals(testItineraries.getBody().get(0), Long.valueOf(1));
	}
	
	@Test
	public void testGetItineraryById() throws NotFoundException{
		Itinerary testItinerary = counterService.readItineraryById(Long.valueOf(1));
		assertEquals(testItinerary.getId(), Long.valueOf(1));
		assertFalse(testItinerary.getId().equals(Long.valueOf(2)));
	}
	
	@Test
	public void testGetItineraryByTraveler() throws NotFoundException{
		List<Itinerary> testItineraries = counterService.readItineraryByTravelerId(Long.valueOf(2));
		assertEquals(testItineraries.get(0).getId(), Long.valueOf(2));
		assertEquals(testItineraries.size(), 1);
	}
	
	@Test
	public void testCreateItinerary() throws NotFoundException{
		ItineraryDTO itineraryDTO = new ItineraryDTO(Long.valueOf(3), new User(), null, new Traveler(), new ArrayList<Ticket>(), "1111-11-11");
		counterService.createItinerary(itineraryDTO);
		assertEquals(itineraryDAO.findAll().size(), 1);
	}
	
	@Test
	public void testCancelItinerary() throws IllegalArgumentException{
		counterService.cancelItinerary(Long.valueOf(1));
		assertEquals(itineraryDAO.findById(Long.valueOf(1)).get().getTickets().get(0).getStatus(), "CANCELLED");
	}
	
	@Test
	public void testReadTickets() throws IllegalArgumentException,NotFoundException{
		Ticket testTicket = counterService.readTickets(Long.valueOf(1));
		assertEquals(testTicket.getSeat_number(), "1A");
	}
	
	@Test
	public void testReadTraveler() throws NotFoundException{
		List<Traveler> listTraveler = counterService.readTravelers();
		assertEquals(listTraveler.size(), 2);
	}
	
	@Test
	public void testSearchTravelerByParam(){
		Traveler traveler = new Traveler();
		traveler.setFirst_name("firstname2");
		List<Traveler> travelers = counterService.searchTravelersByParam(traveler);
		assertEquals(travelers.size(), 1);
	}
	
	@Test
	public void testSearchFlightByParam() {
		Flight flight = new Flight();
		flight.setPrice(100);
		List<Flight> flights = counterService.searchFlightsByParam(flight);
		assertEquals(flights.size(), 1);
	}
}
