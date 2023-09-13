package com.goEdu.myfirstproj;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmp3 {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Query qry = ss.createQuery("update Employee e set e.sal=:mysal where e.id=:myid");
		qry.setParameter("mysal", 120000.00);
		qry.setParameter("myid", 3);
		Transaction tr = ss.beginTransaction();
		int r = qry.executeUpdate();
		tr.commit();
		System.out.println("no of rows affected "+r);
		System.out.println("Successfully Updated");
		ss.close();

	}

}
