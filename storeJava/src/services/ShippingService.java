package services;

import entities.Order;

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
