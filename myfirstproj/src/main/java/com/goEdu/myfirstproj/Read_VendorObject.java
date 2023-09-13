package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Read_VendorObject {
//	Read a Vendor object with Associated child objects values

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Vendor v = (Vendor)ss.get(Vendor.class, 101);
		System.out.println("Parent details : "+v.getVendorId()+","+v.getVendorname());
		Set<Customer> set = v.getCustomers();
		Iterator<Customer> itr = set.iterator();
		while (itr.hasNext()) {
			Customer c =  itr.next();
			System.out.println("CUSTOMERID : "+c.getCustomerId());
			System.out.println("CUSTOMERNAME : "+c.getCustomerName());
			System.out.println("CUSTOMERADDRESS : "+c.getCustomerAddress());
			System.out.println();
		}
	}

}
