package com.GoPro.Relation_proj;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteObj {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		Dealer d = (Dealer)ss.get(Dealer.class,3);
		Transaction tr = ss.beginTransaction();
		ss.delete(d);
		tr.commit();
		ss.close();



	}

}
