package com.goedu.clientproj;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class ReadApp {

	public static void main(String[] args) {
		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		Product p = new Product();
		p.setCname("Samsung");
		p.setPname("tv");
		Product pr  = (Product)ss.load(Product.class, p);
		System.out.println(p.getPrice());
		System.out.println("Successful");

	}

}
