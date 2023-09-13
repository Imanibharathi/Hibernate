package com.goEdu.One_to_One_Annotations;

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
    	
    	Address ad = new Address();
    	ad.setAddressId(12);
    	ad.setPlace("Bng");
    	
    	Student st = new Student();
    	st.setStudentId(101);
    	st.setStudentName("Jo");
    	st.setGrp("IT");
    	
    	ad.setParent(st);
    	
    	Transaction tr = ss.beginTransaction();
    	ss.save(ad);
    	tr.commit();
    	System.out.println("Successfull....");
    	ss.close();
    	
    }
}
