package com.goEdu.myfirstproj;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteParentClient {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Vendor v = (Vendor)ss.get(Vendor.class, 102);
		Transaction tr = ss.beginTransaction();
		ss.delete(v);
		tr.commit();
		ss.close();

	}

}
