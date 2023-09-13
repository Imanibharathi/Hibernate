package com.goEdu.myfirstproj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class CriteriaProjection1 {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Criteria cr = ss.createCriteria(Employee.class);
		cr.setProjection(Projections.property("id"));
		List< Integer>ls = cr.list();
		for (Integer emp : ls) {
			System.out.println(emp);
		}

	}

}
