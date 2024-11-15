package com.hexaware.busfastx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.busfastx.entities.Buses;

public interface IBusesRepository extends JpaRepository <Buses, Long>{

}
