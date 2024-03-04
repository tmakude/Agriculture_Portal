package com.backend.Agriculture.services;

import java.util.List;

import com.backend.Agriculture.entities.Customer;
import com.backend.Agriculture.entities.Orders;

public interface OrderService {

	Orders saveOrder(Orders order);
	List<Orders> getAllOrders();
	List<Orders> getCustomerOrders(Customer customer);
	Orders findById(int id);
}



