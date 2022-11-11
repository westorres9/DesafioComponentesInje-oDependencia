package com.devsuperior.desafioComponentes.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafioComponentes.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		if (order.getBasic() >= 200) {
			return order.getBasic();
		}
		else if (order.getBasic() > 100 && order.getBasic() <= 200) {
			return order.getBasic() + 12.0;
		}
		else {
			return order.getBasic() + 20.0;
		}
	}
}
