package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class NamedQuery {
	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Query qr =ss.getNamedQuery("qr1");
		qr.setParameter(0, 6);
		List< Employee>ls = qr.list();
		Iterator< Employee>	itr = ls.iterator();
		while (itr.hasNext()) {
			Employee emp =  itr.next();
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
		}
		Query sqr = ss.getNamedQuery("qr2");
		sqr.setParameter(0, 4);
		List< Object[]>ls1 = sqr.list();
		
			Object[] obj =  ls1.get(0);
			System.out.println(obj[0]+","+obj[1]+","+obj[2]);
		
		

	}

}
