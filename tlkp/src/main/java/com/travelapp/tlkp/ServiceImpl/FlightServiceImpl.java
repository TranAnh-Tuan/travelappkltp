package com.travelapp.tlkp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelapp.tlkp.Service.FlightService;
import com.travelapp.tlkp.entities.Flight;
import com.travelapp.tlkp.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	private FlightRepository flightRepository;
	
	

	@Autowired
	public FlightServiceImpl(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}

	@Override
	public List<Flight> getAllFlight() {
		
		return this.flightRepository.findAll();
	}

	@Override
	public List<Flight> getFlightByInfo(String address, String destination) {

		return this.flightRepository.getFlightByInfo(address, destination);
	}

	@Override
	public Flight addNewFlight(Flight flight) {
		return this.flightRepository.save(flight);
	}

}
