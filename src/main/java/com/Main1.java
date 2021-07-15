package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();  //import session from org.hibernate	and configuration from org.hibernate.cfg	
		// obtains the session
		Session session = sf.openSession();  //import session from org.hibernate
		session.beginTransaction();
		
		Student s1=new Student("Virat",21);
		Student s2=new Student("Nabina",31);
		session.save(s1);
		session.save(s2);
		
		session.getTransaction().commit();
		session.close();

	}

}

//To insert data in db use save method.
//line number 10,12,13,20 and 21 is compulsary.
