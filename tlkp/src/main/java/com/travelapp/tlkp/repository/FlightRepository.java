package com.travelapp.tlkp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travelapp.tlkp.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
	
	
	@Query(value = "select * from flights where destination_name = :destination and location_name = :address", nativeQuery = true)
	List<Flight> getFlightByInfo(String address, String destination);

}
