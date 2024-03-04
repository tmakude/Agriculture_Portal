package com.backend.Agriculture.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.Agriculture.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
