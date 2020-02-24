package com.smoothstack.avalanche.ars.counter.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smoothstack.avalanche.ars.counter.entity.Traveler;

@Repository
public interface TravelerDAO 
	extends JpaRepository<Traveler,Long>, JpaSpecificationExecutor<Traveler>{

}
