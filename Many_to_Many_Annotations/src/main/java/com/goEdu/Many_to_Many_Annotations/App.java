package com.goEdu.Many_to_Many_Annotations;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf = new Configuration().configure();
    	Session ss = cf.buildSessionFactory().openSession();
    	
    	Categories cg1 = new Categories();
    	cg1.setCategoriesId(1011);
    	cg1.setCategoryName("Plastics");
    	
    	Categories cg2 = new Categories();
    	cg2.setCategoriesId(1012);
    	cg2.setCategoryName("Electronics");
    	
    	Items it1 = new Items();
    	it1.setItemId(101);
    	it1.setItemName("chair");
    	Items it2 = new Items();
    	it2.setItemId(102);
    	it2.setItemName("board");
    	Set<Items> set = new HashSet<Items>();
    	set.add(it1);set.add(it2);
    	cg1.setItems(set);
    	cg2.setItems(set);
    	Transaction tr = ss.beginTransaction();
    	ss.save(cg1);ss.save(cg2);
    	tr.commit();
    	System.out.println("Successfull.....");
    	ss.close();
    	
    }
}
