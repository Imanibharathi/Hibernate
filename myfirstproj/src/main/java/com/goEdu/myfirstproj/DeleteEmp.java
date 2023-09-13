package com.goEdu.myfirstproj;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class DeleteEmp {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Query qry = ss.createQuery("delete From Employee e where e.id=4");
		Transaction tr = ss.beginTransaction();
		int r = qry.executeUpdate();
		tr.commit();
		System.out.println("no of rows affected "+r);
		ss.close();

	}

}
