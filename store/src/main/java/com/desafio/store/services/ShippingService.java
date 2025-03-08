package com.desafio.store.services;

import org.springframework.stereotype.Service;

import com.desafio.store.entities.Order;

@Service
public class ShippingService {

	public double shipping(Order order) {

		double total;
		if (order.getBasic() < 100) {
			total = +20.0;
		} else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
			total = +12.0;
		} else {
			total = +0.0;

		}
		return total;
	}

}
