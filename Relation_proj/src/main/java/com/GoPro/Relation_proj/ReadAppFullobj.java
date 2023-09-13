package com.GoPro.Relation_proj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ReadAppFullobj {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Query qry = ss.createQuery("from Dealer d");
		List<Dealer>ls = qry.list();
		Iterator<Dealer>itr = ls.iterator();
		while (itr.hasNext()) {
			Dealer d =  itr.next();
			System.out.println("Parent details : "+d.getDealerId()+","+d.getDealerName());
			List<Product>ls1 = d.getProducts();
			Iterator<Product>itr1=ls1.iterator();
			while (itr1.hasNext()) {
				Product p =  itr1.next();
				System.out.println("Product details : ");
				System.out.println("ProductId : "+p.getProductId());
				System.out.println("ProductName : "+p.getProductName());
				System.out.println("ProductPrice : "+p.getPrice());
				System.out.println();
				
			}
		}
		ss.close();

	}

}
