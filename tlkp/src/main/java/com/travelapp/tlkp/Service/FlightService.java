package com.travelapp.tlkp.Service;

import java.util.List;

import com.travelapp.tlkp.entities.Flight;

public interface FlightService {
	
	public List<Flight> getAllFlight();
	
	public List<Flight> getFlightByInfo(String address, String destination);
	
	public Flight addNewFlight(Flight flight);

}
