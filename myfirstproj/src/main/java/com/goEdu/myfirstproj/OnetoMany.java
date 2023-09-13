package com.goEdu.myfirstproj;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class OnetoMany {
	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		//Parent object
		Vendor v = new Vendor();
		v.setVendorId(102);
		v.setVendorname("Ko");
		
		//Child object
		Customer c1 = new Customer();
		c1.setCustomerId(504);
		c1.setCustomerName("Hari");
		c1.setCustomerAddress("Namakal");
		
		Customer c2 = new Customer();
		c2.setCustomerId(505);
		c2.setCustomerName("Gowtham");
		c2.setCustomerAddress("Guntur");
		
		Customer c3 = new Customer();
		c3.setCustomerId(506);
		c3.setCustomerName("Gowtam");
		c3.setCustomerAddress("Coimbatore");
		
		Set<Customer> s = new HashSet<Customer>();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		v.setCustomers(s);
		
		Transaction tr = ss.beginTransaction();
		ss.save(v);
		tr.commit();
		ss.close();
		

	}

}
