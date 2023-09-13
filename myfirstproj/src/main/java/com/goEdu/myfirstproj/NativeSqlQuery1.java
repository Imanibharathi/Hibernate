package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class NativeSqlQuery1 {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		SQLQuery sq = ss.createSQLQuery("Select * From employee");
		List< Object[]>ls = sq.list();
		Iterator< Object[]>	itr = ls.iterator();
		while (itr.hasNext()) {
			Object[] obj =  itr.next();
			System.out.println(obj[0]+","+obj[1]+","+obj[2]);
		}
		
//		for (Object[] obj : ls) {
//		for (int i = 0; i < obj.length; i++) {
//			System.out.print(obj[i]+",");
//		}
//		System.out.println();
		
	}

}
