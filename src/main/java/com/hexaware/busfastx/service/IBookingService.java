package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entities.Booking;

public interface IBookingService {
	
	public Booking addBooking(Booking booking);
	public Booking update(Booking booking);
	public void deleteBookingById(int bookingId);
	public Booking getBookingById(int bookingId);
	public List<Booking> getAllBookings();
	

}
