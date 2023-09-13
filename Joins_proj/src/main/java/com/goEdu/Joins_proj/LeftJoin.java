package com.goEdu.Joins_proj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class LeftJoin {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
    	Session ss = cf.buildSessionFactory().openSession();
    	Query qry = ss.createQuery("select c.Customer_Name,c.Customer_City,i.Item_Name,i.price Leftjoin c.items i");
    	List  ls = qry.list();
    	Iterator itr = ls.iterator();
    	while (itr.hasNext()) {
			Object rows[] = (Object[])itr.next();
			System.out.println(rows[0]+"_"+rows[1]+"_"+rows[2]+"_"+rows[3]);
		}
    	System.out.println("Fetched successfully.....");

	}

}
