package com.backend.Agriculture.services;


import com.backend.Agriculture.entities.Payment;

public interface PaymentService {

	Payment savePayment(Payment payment);
	
	Payment findPaymentById(int id);
}

