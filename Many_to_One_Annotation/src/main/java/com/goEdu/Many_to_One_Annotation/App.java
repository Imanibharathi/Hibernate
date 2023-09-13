package com.goEdu.Many_to_One_Annotation;

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
    	
    	Vendor v= new Vendor();
    	v.setVid(1010);
    	v.setVendorName("Jo");
    	
    	Customers c1 = new Customers();
    	c1.setCid(11);
    	c1.setCname("Dhamayanthi");
    	c1.setVendor(v);
    	
    	Customers c2 = new Customers();
    	c2.setCid(12);
    	c2.setCname("Ko");
    	c2.setVendor(v);
    	
    	Transaction tr = ss.beginTransaction();
    	ss.save(c1);ss.save(c2);
    	tr.commit();
    	System.out.println("Successfull.....");
    	ss.close();
    }
}
