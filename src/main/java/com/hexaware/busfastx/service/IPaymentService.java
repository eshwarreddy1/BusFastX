package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entity.Payment;

public interface IPaymentService {
	
	public Payment addPayment(Payment payment);
	public Payment update(Payment payment);
	public void deletePaymentById(int paymentId);
	public Payment getPaymentById(int paymentId);
	public List<Payment> getAllpayments();
	

}
