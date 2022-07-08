package com.travelapp.tlkp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "flight_order")
public class flight_orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User users;
	
	
	@ManyToOne
	@JoinColumn(name = "flight_id")
	private Flight flights;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Flight getFlights() {
		return flights;
	}

	public void setFlights(Flight flights) {
		this.flights = flights;
	}

	public flight_orders() {

	}
	
	
	
	

}
