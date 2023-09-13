package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class NativeSqlQuery2 {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		SQLQuery sq = ss.createSQLQuery("Select * From employee").addEntity(Employee.class);
		List< Employee>ls = sq.list();
		Iterator< Employee>	itr = ls.iterator();
		while (itr.hasNext()) {
			Employee emp =  itr.next();
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
		}
		
//		for (Object[] obj : ls) {
//		for (int i = 0; i < obj.length; i++) {
//			System.out.print(obj[i]+",");
//		}
//		System.out.println();

	}

}
