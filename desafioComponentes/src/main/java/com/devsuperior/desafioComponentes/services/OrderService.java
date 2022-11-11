package com.devsuperior.desafioComponentes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafioComponentes.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
		
	public double total(Order order) {
		return shippingService.shipment(order) - ((order.getBasic() * order.getDiscount()/100)) ;
	}
}
