package com.GoPro.Relation_proj;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class OnetoMany {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		Dealer d = new Dealer();
		d.setDealerId(3);
		d.setDealerName("mo");
		
		Product p1 = new Product();
		p1.setProductId(105);
		p1.setProductName("washing machine");
		p1.setPrice(50786.00);
		
		Product p2 = new Product();
		p2.setProductId(106);
		p2.setProductName("Mixer grinder");
		p2.setPrice(7890.00);
		
		List<Product> l = new ArrayList<Product>();
		l.add(p1);
		l.add(p2);
	
		d.setProducts(l);
		Transaction tr = ss.beginTransaction();
		ss.save(d);
		tr.commit();
		ss.close();
		
		
		
		

	}

}
