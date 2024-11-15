package com.trips.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trips.dao.Trips;
import com.trips.repository.TripsRepository;

@Service
public class TripsService {

	@Autowired TripsRepository repository;
	
	public Trips addTrips(Trips trips) {
		return repository.save(trips);
	}
	
	public List<Trips> fetchTrips(){
		return repository.findAll();
	}
}
