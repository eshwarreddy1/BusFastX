package com.hexaware.busfastx.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Buses")
public class Buses {
	@Id
    private long operatorId;
    private String busNumber;
    private int numberOfSeats;
    private String origin;
    private String destination;
    private String departureTime;
    private double fare;
    private LocalDate date;
	public Buses() {
		super();
	}
	public Buses(long operatorId, String busNumber, int numberOfSeats, String origin, String destination,
			String departureTime, double fare, LocalDate date) {
		super();
		this.operatorId = operatorId;
		this.busNumber = busNumber;
		this.numberOfSeats = numberOfSeats;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.fare = fare;
		this.date = date;
	}
	public long getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(long operatorId) {
		this.operatorId = operatorId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Buses [operatorId=" + operatorId + ", busNumber=" + busNumber + ", numberOfSeats=" + numberOfSeats
				+ ", origin=" + origin + ", destination=" + destination + ", departureTime=" + departureTime + ", fare="
				+ fare + ", date=" + date + "]";
	}
    

}
