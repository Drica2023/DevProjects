package app;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import services.OrderService;
import services.ShippingService;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Codigo: ");
		Integer code = sc.nextInt();
		System.out.println("Valor Basico: ");
		double basic = sc.nextDouble();
		System.out.println("Desconto: ");
		double discount = sc.nextDouble();
			
		//discount = basic * discount /100;
		/*double total = basic - discount; 
		
		if(total < 100) {
			total = total + 20.0;
		}else if (total >= 100 && total <= 200) {
			total = total + 12.0;
		}else {
			total = total + 0.0;
		}*/
		
		Order order = new Order(code, basic, discount);
		ShippingService shippingService =new ShippingService();
		OrderService orderService = new OrderService(shippingService);
		double total  = orderService.total(order) ;
		
		System.out.println("pedido codigo: " + code);
		System.out.printf("Valor total %.2f%n", total );
		sc.close();
		
		
	}
}
