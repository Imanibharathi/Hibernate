package com.GoPro.Relation_proj;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytoOne {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Transaction tr = ss.beginTransaction();
		//		Parent object
		Vendor v = new Vendor();
		v.setVendorId(102);
		v.setVendorName("Jo");
//		Child object
		Customer c1 = new Customer();
		c1.setCustomerId(13);
		c1.setCustomerName("Raghu");
		c1.setCustomerAddress("Bng");
		
		Customer c2 = new Customer();
		c2.setCustomerId(14);
		c2.setCustomerName("Guru");
		c2.setCustomerAddress("Shimokha");
//		Adding Parent object to child object
		c1.setVendor(v);
		c2.setVendor(v);
		ss.save(c1);ss.save(c2);
		tr.commit();
		ss.close();

	}

}
