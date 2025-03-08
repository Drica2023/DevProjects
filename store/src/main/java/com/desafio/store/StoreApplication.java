package com.desafio.store;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.store.entities.Order;
import com.desafio.store.services.OrderService;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Codigo: ");
		Integer code = sc.nextInt();
		System.out.println("Valor Basico: ");
		double basic = sc.nextDouble();
		System.out.println("Desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println("pedido codigo: " + code);
		System.out.printf("Valor total: " + (orderService.total(order)));
		sc.close();

	}

}
