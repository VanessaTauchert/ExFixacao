package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente cliente = new Cliente("Alex Green (", ") - alex@gmail.com ", sdf.parse("15/03/1985"));
		
		Order order = new Order(new Date(), OrderStatus.PROCESSING , cliente);
		
		Product product1 = new Product("TV", 1000.00);
		Product product2 = new Product("Mouse", 40.00);
		
		OrderItem orderItem1 = new OrderItem(1, 1000.00, product1);
		OrderItem orderItem2 = new OrderItem(2, 40.00, product2);

		order.addItem(orderItem1);
		order.addItem(orderItem2);
		
		System.out.println(order);

	
	}

}
