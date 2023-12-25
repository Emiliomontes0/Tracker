package com.Tracker.Tracker;

import com.Tracker.Tracker.Entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.Tracker.Tracker.Entity.User;

@SpringBootApplication
public class TrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}
	Product product = new Product(1 , 1 , "item",1);
	Product product2 = new Product(2 , 2 , "temp",2);
	Product product3 = new Product(3 , 3 , "toy",3);
}
