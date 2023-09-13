package com.goEdu.myfirstproj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaProjections2 {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Criteria cr = ss.createCriteria(Employee.class);
		cr.setProjection(Projections.property("name"));
		cr.addOrder(Order.asc("name"));
		List< String> ls = cr.list();
		for (String str : ls) {
			System.out.println(str);
		}
		

	}

}
