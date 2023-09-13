package com.goEdu.myfirstproj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class CriteriaProjectionObj1 {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss =  cf.buildSessionFactory().openSession();
		Criteria cr = ss.createCriteria(Employee.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("id"));
		pl.add(Projections.property("name"));
		cr.setProjection(pl);
		List<Object[]>ls = cr.list();
		for (Object[] obj : ls) {
			System.out.println(obj[0]+","+obj[1]);
		}

	}

}
