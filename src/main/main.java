package main;

import java.util.ArrayList;
import java.util.List;
import Model.CustomerType;
import Model.Order;

public class main {
	 public static void main(String[] args) {
	        List<String> items = new ArrayList<>();
	        items.add("Artículo1");
	        items.add("Artículo2");

	        Order order = new Order("Alice", CustomerType.VIP, items, 1200);
	        order.applyDiscount();
	        order.calculateTax();
	        order.printOrderDetails();
	    }

}

