package com.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trips.dao.Trips;

public interface TripsRepository extends JpaRepository<Trips, String> {

}
