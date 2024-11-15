package com.hexaware.busfastx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.busfastx.entities.Booking;



public interface BookingRepository extends JpaRepository <Booking, Integer>{

}
