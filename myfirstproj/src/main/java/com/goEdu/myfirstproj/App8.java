package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App8 {

	public static void main(String[] args) {
		 Configuration cf = new Configuration();
		   cf.configure();
		   SessionFactory sf = cf.buildSessionFactory();
		   Session ss = sf.openSession();
		   System.out.println("Successful");
		   Query qr = ss.createQuery("select max(e.sal),min(e.sal) from Employee e");
		   List ls = qr.list(); 
		   System.out.println("number of records : "+ls.size());
		   Iterator itr=ls.iterator();
		   while(itr.hasNext())
		   {
			   Object obj[ ]=(Object[ ])ls.get(0);
			   System.out.println(obj[0]+","+obj[1]);
		   }

	}

}
