package com.hexaware.busfastx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.busfastx.entity.Payment;

public interface PaymentRepository extends JpaRepository <Payment, Integer>{

}
