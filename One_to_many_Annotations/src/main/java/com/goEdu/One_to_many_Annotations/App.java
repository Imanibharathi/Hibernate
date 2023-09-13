package com.goEdu.One_to_many_Annotations;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf = new Configuration().configure();
    	Session ss = cf.buildSessionFactory().openSession();
    	
    	Vendor v = new Vendor();
    	v.setVendorId(1011);
    	v.setVendorName("Raghu");
    	
    	Customers c1 = new Customers();
    	c1.setCustomerId(101);
    	c1.setCustomerName("Hema");
    	
    	Customers c2 = new Customers();
    	c2.setCustomerId(102);
    	c2.setCustomerName("Havi");
    	Customers c3 = new Customers();
    	c3.setCustomerId(103);
    	c3.setCustomerName("Mani");
    	Set<Customers> set = new HashSet<Customers>();
    	set.add(c1);set.add(c2);set.add(c3);
    	v.setCustomers(set);
    	Transaction tr = ss.beginTransaction();
    	ss.save(v);
    	tr.commit();
    	System.out.println("Successfull.....");
    	ss.close();
    }
}
