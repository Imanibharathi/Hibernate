package com.GoPro.Relation_proj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ReadApp {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		Dealer d = (Dealer)ss.get(Dealer.class,3);
		System.out.println("Parent details : "+d.getDealerId()+","+d.getDealerName() );
		List<Product> ls = d.getProducts();
		
		for (Product p : ls) {
			System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getPrice());
		}
//		Iterator<Product> itr = ls.iterator();
//		while (itr.hasNext()) {
//			Product p =  itr.next();
//			System.out.println("Product details : ");
//			System.out.println("ProductId : "+p.getProductId());
//			System.out.println("ProductName : "+p.getProductName());
//			System.out.println("ProductPrice : "+p.getPrice());
//			System.out.println();
//			
//		}
		ss.close();

	}

}
