package com.GoPro.Relation_proj;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Removechildfromparent {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		Dealer d = (Dealer)ss.get(Dealer.class,3);
		System.out.println("Parent details : "+d.getDealerId()+","+d.getDealerName() );
		List<Product>ls= d.getProducts();
		Product p = (Product)ss.get(Product.class, 105);
		Transaction tr = ss.beginTransaction();
		ls.remove(p);
		tr.commit();
		ss.close();

	}

}
