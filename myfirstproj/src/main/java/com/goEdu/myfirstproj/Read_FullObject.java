package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Read_FullObject {

	public static void main(String[] args) {
//		To Read the Full Object
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Query qry = ss.createQuery("from Vendor v");
		List<Vendor> ls = qry.list();
		Iterator<Vendor>itr=ls.iterator();
		while (itr.hasNext()) {
			Vendor v =  itr.next();
			System.out.println("Parent details : "+v.getVendorId()+","+v.getVendorname());
			Set<Customer>set = v.getCustomers();
			Iterator<Customer>it1 = set.iterator();
			while (it1.hasNext()) {
				Customer c = (Customer) it1.next();
				System.out.println("CustomerId : "+c.getCustomerId());
				System.out.println("CustomerName : "+c.getCustomerName());
				System.out.println("CustomerAddress : "+c.getCustomerAddress());
				System.out.println();
			}
			
		}
		ss.close();

	}

}
