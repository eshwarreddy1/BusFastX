package com.hexaware.busfastx.service;

import java.time.LocalDate;
import java.util.List;

import com.hexaware.busfastx.entities.Buses;

public interface IBusesService {
	public Buses createBuses(Buses bus);
	public Buses updateBuses(Buses buse,Long busId);
	public void  deleteBuses(Long busId);
	public Buses getBusById(Long busId);
	 List<Buses> getAllBusesByCitiesAndDate(String sourceCity, String destinationCity, LocalDate date);
	
	public List<Buses>getAllBuses();

}
