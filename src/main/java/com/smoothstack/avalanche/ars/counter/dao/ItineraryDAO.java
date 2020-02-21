package com.smoothstack.avalanche.ars.counter.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.avalanche.ars.counter.entity.Itinerary;

@Repository
public interface ItineraryDAO extends JpaRepository<Itinerary,Long>{

}
