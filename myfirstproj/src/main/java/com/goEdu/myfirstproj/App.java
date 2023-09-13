package com.goEdu.myfirstproj;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class App 
{
	public static void main(String[] args) {
	   Configuration cf = new Configuration();
	   cf.configure();
	   SessionFactory sf = cf.buildSessionFactory();
	   Session ss = sf.openSession();
	   System.out.println("Successful");
	   Query qr = ss.createQuery("select e from Employee e");
	   List ls = qr.list(); 
	   System.out.println("number of records : "+ls.size());
	   Iterator itr=ls.iterator();
	   while(itr.hasNext())
	   {
		   Employee emp = (Employee)itr.next();
		   System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
	   }
	  
	   
	   
	   
	   
	   
	
	}

}

