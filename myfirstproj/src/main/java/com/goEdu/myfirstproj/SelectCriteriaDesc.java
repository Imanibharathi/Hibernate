package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class SelectCriteriaDesc {
public static void main(String[] args) {
	Configuration cf = new Configuration().configure();
	Session ss = cf.buildSessionFactory().openSession();
	Criteria cr = ss.createCriteria(Employee.class);
	Criterion crt = Restrictions.like("name", "%m%");
	cr.add(crt);
	cr.addOrder(Order.desc("sal"));
	List ls = cr.list();
	Iterator it = ls.iterator();
	while (it.hasNext()) {
		Employee emp = (Employee) it.next();
		System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
	}
	
	

}

}


