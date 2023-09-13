package com.JoyLife.Relation2_proj;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Many2many 
{
    public static void main( String[] args )
    {
    	Configuration cf = new Configuration().configure();
    	Session ss = cf.buildSessionFactory().openSession();
    	Student s1 = new Student();
    	s1.setSid(101);
    	s1.setSname("Hema");
    	Student s2 = new Student();
    	s2.setSid(102);
    	s2.setSname("Havi");
    	Student s3 = new Student();
    	s3.setSid(103);
    	s3.setSname("Jo");
    	Course c1 = new Course();
    	c1.setCid(2000);
    	c1.setCname("Java8");
    	Course c2 = new Course();
    	c2.setCid(2001);
    	c2.setCname("Python5.6");
    	Set<Course>cs =new HashSet<Course>();
    	cs.add(c1);cs.add(c2);
    	s1.setCourses(cs);
    	s2.setCourses(cs);
    	s3.setCourses(cs);
//    	otherwise we can set students then add students 
    	Transaction tr = ss.beginTransaction();
    	ss.save(s1);
    	ss.save(s2);
    	ss.save(s3);
    	tr.commit();
    	ss.close();
    }
}
