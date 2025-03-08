package com.desafio.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.store.entities.Order;

@Service
public class OrderService {
	// Forma errada
	// ShippingService shippingService = new ShippingService();
	@Autowired
	private ShippingService shippingService; // Forma Correta

	public double total(Order order) {

		double discount = order.getBasic() - (order.getBasic() * order.getDiscount() / 100);

		return discount + shippingService.shipping(order);
	}

}
