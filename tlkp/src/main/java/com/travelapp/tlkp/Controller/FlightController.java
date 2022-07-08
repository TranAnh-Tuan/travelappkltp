package com.travelapp.tlkp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelapp.tlkp.Service.FlightService;
import com.travelapp.tlkp.entities.Flight;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
	
	private FlightService flightService;
	
	
	@Autowired
	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}



	@GetMapping
	public List<Flight> getAllFlight(){
		return this.flightService.getAllFlight();
	}
	
	@GetMapping("/detail")
	public List<Flight> getFlightByInfo(
			@RequestParam(name = "des", required = false, defaultValue = "new york") String destination,
			@RequestParam(name = "loc", required = false, defaultValue = "viet nam") String location
			){
		return this.flightService.getFlightByInfo(location, destination);
	}
	
	@PostMapping
	public Flight addFlight(@RequestBody Flight flight) {
		return this.flightService.addNewFlight(flight);
		
	}

}
