package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entities.BusOperators;

public interface IBusOperatorsService {
	public BusOperators createBusOperators(BusOperators busoperatorsdto);
	public BusOperators updateBusOperators(BusOperators busoperatorsdto,Long operatorId);
	public void deleteBusOperators(Long operatorId);
	public BusOperators getBusOperatorsById(Long OperatorId);
	public List<BusOperators> findByOperatorName(String operatorName);
	public List<BusOperators>getAllBusOperators();

}
