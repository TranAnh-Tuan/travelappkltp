package com.travelapp.tlkp.entities;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "flights")
public class Flight {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private int flightId;
	
	@Column(name = "department_day")
	private Date departmentDay;
	
	@Column(name = "flight_code")
	private String flightCode;
	
	@Column(name = "iata_code")
	private String iataCode;
	
	@Column(name = "location_name")
	private String locationName;
	
	@Column(name = "destination_name")
	private String destinationName;
	
	@Column(name = "location_code")
	private String locationCode;
	
	@Column(name = "destination_code")
	private String destinationCode;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "flights")
	private List<flight_orders> flightOrders;
	
	@Column(name = "price")
	private int price;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public Date getDepartmentDay() {
		return departmentDay;
	}

	public void setDepartmentDay(Date departmentDay) {
		this.departmentDay = departmentDay;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
