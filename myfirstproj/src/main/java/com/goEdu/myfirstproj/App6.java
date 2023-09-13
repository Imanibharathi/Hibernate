package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App6 {

	public static void main(String[] args) {
		 Configuration cf = new Configuration();
		   cf.configure();
		   SessionFactory sf = cf.buildSessionFactory();
		   Session ss = sf.openSession();
		   System.out.println("Successful");
		   Query qr = ss.createQuery("from Employee e where e.sal>=? and e.sal<=?");
		   qr.setParameter(0, 40000.00);
		   qr.setParameter(1, 90000.00);
		   List<Employee> ls = qr.list(); 
		   System.out.println("number of records : "+ls.size());
		   Iterator<Employee> itr=ls.iterator();
		   while(itr.hasNext())
		   {
			   Employee emp = itr.next();
			   System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
		   }
	}

}
