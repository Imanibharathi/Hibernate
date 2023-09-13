package com.GoPro.Relation_proj;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateChildobj {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Dealer d =(Dealer)ss.get(Dealer.class,3);
		System.out.println("Parent details : "+d.getDealerId()+","+d.getDealerName());
		List<Product>ls = d.getProducts();
		Product p1 = new Product();
		p1.setProductId(204);
		p1.setProductName("Fridge");
		p1.setPrice(24500.00);
		Product p2 = new Product();
		p2.setProductId(209);
		p2.setProductName("Tv");
		p2.setPrice(78000.00);
		Transaction tr = ss.beginTransaction();
		ls.add(p1);ls.add(p2);
		tr.commit();
		ss.close();
		
		
		
		
	

	}

}
