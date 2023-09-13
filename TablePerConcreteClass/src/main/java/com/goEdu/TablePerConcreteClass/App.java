package com.goEdu.TablePerConcreteClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
	public static void main( String[] args )
    {
    	Configuration cf = new Configuration().configure();
    	Session ss = cf.buildSessionFactory().openSession();
    	
    	Employee emp = new Employee();
    	emp.setId(123);
    	emp.setName("Jo");
    	
    	Regular_Employee r1 = new Regular_Employee();
    	r1.setId(101);
    	r1.setName("Raghu");
    	r1.setSalary(120000.00);
    	r1.setBonus(5000);
    	
    	Contract_Employee c1 = new Contract_Employee();
    	c1.setId(102);
    	c1.setName("Pinky");
    	c1.setPay_per_hr(1000.00);
    	c1.setContract_period("9 months");
    	
    	Transaction tr = ss.beginTransaction();
    	ss.save(emp);ss.save(r1);ss.save(c1);
    	tr.commit();
    	System.out.println("Successfull....");
    	ss.close();
    	
    }
}
