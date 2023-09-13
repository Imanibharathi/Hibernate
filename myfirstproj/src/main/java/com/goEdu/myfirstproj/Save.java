package com.goEdu.myfirstproj;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Save {

	public static void main(String[] args) {
		   Configuration cf = new Configuration();
		   cf.configure();
		   SessionFactory sf = cf.buildSessionFactory();
		   Session ss = sf.openSession();
		   Employee e1 = new Employee();
		   e1.setId(1);
		   e1.setName("pruthvi");
		   e1.setSal(150000);
		   
		   Employee e2 = new Employee();
		   e2.setId(2);
		   e2.setName("pruthvi");
		   e2.setSal(150000);
		   
		   Transaction t = ss.beginTransaction();
		   ss.save(e1);
		   ss.save(e2);
		   t.commit();
		   sf.close();
		   ss.close();

	}

}
