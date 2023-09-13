package com.goEdu.myfirstproj;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmp {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Query qry = ss.createQuery("Insert into Doctor(did,dname,dsal)"
				+ "Select e.id,e.name,e.sal"
				+ " From Employee e where e.id =3");
		Transaction tr = ss.beginTransaction();
		int r = qry.executeUpdate();
		tr.commit();
		System.out.println("no of rows affected "+r);
		System.out.println("Successfully Inserted");
		ss.close();

	}

}
