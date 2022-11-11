package com.devsuperior.desafioComponentes;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafioComponentes.entities.Order;
import com.devsuperior.desafioComponentes.services.OrderService;

@SpringBootApplication
public class DesafioComponentesApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.println();
		Integer code = sc.nextInt();
		Double basic = sc.nextDouble();
		Double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println();
		System.out.println("Pedido código: " + order.getCode());
		System.out.printf("Valor Total: R$ %.2f%n ", orderService.total(order));
		
	}

}
