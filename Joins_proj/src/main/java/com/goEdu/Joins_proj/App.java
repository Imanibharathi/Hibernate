package com.goEdu.Joins_proj;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf = new Configuration().configure();
    	Session ss = cf.buildSessionFactory().openSession();
    	
    	Customer c1 = new Customer();
    	c1.setCname("Ramu");
    	c1.setCcity("Bng");
    	
    	Customer c2 = new Customer();
    	c2.setCname("Raju");
    	c2.setCcity("Bng");
    	
    	Item i1 = new Item();
    	i1.setItemname("Mobile");
    	i1.setPrice(85000.00);
    	
    	Item i2 = new Item();
    	i2.setItemname("Tv");
    	i2.setPrice(58950.00);
    	
    	Item i3 = new Item();
    	i3.setItemname("Laptop");
    	i3.setPrice(125500.00);
    	
    	Item i4 = new Item();
    	i4.setItemname("Pen");
    	i4.setPrice(10.00);
    	
    	Set< Item> set1 = new HashSet<Item>();
    	set1.add(i1);set1.add(i2);
    	
    	Set<Item>set2= new HashSet<Item>();
    	set2.add(i3);set2.add(i4);
    	
    	c1.setItems(set1);
    	c2.setItems(set2);
    	
    	Transaction tr = ss.beginTransaction();
    	ss.save(c1);ss.save(c2);
    	tr.commit();
    	System.out.println("Successfull....................................................................!");
    	ss.close();
    }
}
