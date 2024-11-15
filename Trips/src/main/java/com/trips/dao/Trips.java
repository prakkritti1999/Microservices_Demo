package com.trips.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Trips {

	@Id
	private String trip_id;
	
	@Override
	public String toString() {
		return "Trips [trip_id=" + trip_id + ", OD=" + OD + ", duration=" + duration + ", category=" + category
				+ ", charges=" + charges + "]";
	}
	private String OD;
	private String duration;
	private String category;
	private int charges;
	
}
