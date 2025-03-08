package services;

import entities.Order;

public class OrderService {
	// Forma errada
	// ShippingService shippingService = new ShippingService();

	private ShippingService shippingService; //Forma Correta

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(Order order) {

		double discount = order.getBasic() - (order.getBasic() * order.getDiscount() / 100);

		return discount + shippingService.shipping(order);
	}

}
