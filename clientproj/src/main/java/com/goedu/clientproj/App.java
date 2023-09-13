package com.goedu.clientproj;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class App 
{
    public static void main( String[] args )
    {
    	Product p = new Product();
    	p.setCname("jo");
    	p.setPname("mobile");
    	p.setPrice(98000.00);
    	Configuration cf = new Configuration().configure();
    	Session ss = cf.buildSessionFactory().openSession();
    	Transaction tr = ss.beginTransaction();
    	ss.save(p);
    	tr.commit();
    	System.out.println("successfull");
    	ss.close();
    }
}
