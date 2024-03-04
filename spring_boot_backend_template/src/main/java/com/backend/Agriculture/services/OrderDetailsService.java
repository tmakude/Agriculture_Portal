package com.backend.Agriculture.services;


import java.util.List;
import java.util.Optional;

import com.backend.Agriculture.entities.OrderDetails;
import com.backend.Agriculture.entities.Orders;


public interface OrderDetailsService {

	void saveOrderDetails(OrderDetails od);
	OrderDetails findById(int id);
	List<OrderDetails> findByOrder(Orders order);
	
}
