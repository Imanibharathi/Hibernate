package com.goEdu.myfirstproj;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddonemoreChildObj {

	public static void main(String[] args) {
//		Add one more child object to parent object
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Vendor v = (Vendor)ss.get(Vendor.class, 102);
		System.out.println("Parent details : "+v.getVendorId()+","+v.getVendorname());
		Set<Customer> set = v.getCustomers();
		Customer c1 = new Customer();
		c1.setCustomerId(601);
		c1.setCustomerName("Shivangi");
		c1.setCustomerAddress("Kerala");
		Customer c2 = new Customer();
		c2.setCustomerId(602);
		c2.setCustomerName("Dharshan");
		c2.setCustomerAddress("ooty");
		Customer c3 = new Customer();
		c3.setCustomerId(603);
		c3.setCustomerName("Shruthika");
		c3.setCustomerAddress("Chennai");
		Transaction tr = ss.beginTransaction();
		set.add(c1);set.add(c2);set.add(c3);
		tr.commit();
		ss.close();
		

	}

}
