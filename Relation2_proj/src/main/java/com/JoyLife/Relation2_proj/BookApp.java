package com.JoyLife.Relation2_proj;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookApp {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		BookComposite bc = new BookComposite();
		bc.setBookId(104);
		bc.setIsbn(11114);
		
		Book b = new Book();
		b.setBookcomposite(bc);
		b.setAuthor("Raghu");
		b.setPrice(1200.00);
		Transaction tr = ss.beginTransaction();
		ss.save(b);
		tr.commit();
		System.out.println("Successfull......");
		ss.close();

	}

}
