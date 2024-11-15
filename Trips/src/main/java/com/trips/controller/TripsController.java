package com.trips.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trips.dao.Trips;
import com.trips.service.TripsService;

@RestController
@RequestMapping("/trips")
public class TripsController {

	@Autowired TripsService tripsService;
	
	@PostMapping
	public Trips saveTrips(@RequestBody Trips trips) {
		return tripsService.addTrips(trips);
	}
	
	@GetMapping
	public List<Trips> getAllTrips(){
		return tripsService.fetchTrips();
	}
	
}
