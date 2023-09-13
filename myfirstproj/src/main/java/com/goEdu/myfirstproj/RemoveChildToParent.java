package com.goEdu.myfirstproj;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RemoveChildToParent {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Vendor v = (Vendor)ss.get(Vendor.class, 102);
		Set<Customer>set = v.getCustomers();
		Customer c = (Customer)ss.get(Customer.class,504);
		Transaction tr = ss.beginTransaction();
		set.remove(c);
		tr.commit();
		ss.close();

	}

}
