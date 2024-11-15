package com.hexaware.busfastx.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {
	
	@Id
	private int bookingId;
    private int userId;
    private int busId;
    private LocalDate bookingDate;
    private LocalDate journeyDate;
    private double totalAmount;
    private String bookingStatus;
	public Booking() {
		super();
	}
	public Booking(int bookingId, int userId, int busId, LocalDate bookingDate, LocalDate journeyDate, double totalAmount,
			String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.busId = busId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.totalAmount = totalAmount;
		this.bookingStatus = bookingStatus;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", busId=" + busId + ", bookingDate="
				+ bookingDate + ", journeyDate=" + journeyDate + ", totalAmount=" + totalAmount + ", bookingStatus="
				+ bookingStatus + "]";
	}

}
