package com.easylearning.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.easylearning.entities.Country;
import com.easylearning.entities.Employee;

public class Application {

	private static SessionFactory factory;

	public static void main(String[] args) {
		factory = HibernateUtil.getSessionFactory();
		try {
			updateDemo1();
		}finally {
			factory.close();
		}

	}
	
	public static void updateDemo1() {
		try (Session session = factory.openSession()) {
			session.beginTransaction();
			Employee e1 = session.get(Employee.class, 206L); //object state changed : None ->Transient
			session.evict(e1);   //object state changed : Transient  -> Detached
			session.saveOrUpdate(e1);  //object state changed : Detached  ->  Transient  
			e1.setFirstName("Test again");

			session.getTransaction().commit();
		}
	}
	
	
	public static void updateDemo() {
		try (Session session = factory.openSession()) {
			session.beginTransaction();
			Employee e1 = session.get(Employee.class, 206L); //object state changed : None ->Transient
			session.evict(e1);   //object state changed : Transient  -> Detached
			Employee e2=(Employee) session.merge(e1);  //object state changed : Detached  ->  Transient  
			e2.setFirstName("Test");

			session.getTransaction().commit();
		}
	}
	
	public static void deleteDemo() {

		try (Session session = factory.openSession()) {
			session.beginTransaction();
			Country c = session.get(Country.class, "T1");
			pause(session.contains(c), 1);
			session.remove(c);
			pause(session.contains(c), 1);
			c.setCountryName("abcd");
			session.getTransaction().commit();
		}
	}
	
	public static void getDemo() {

		try (Session session = factory.openSession()) {
			session.beginTransaction();
			Employee employee = session.get(Employee.class, 206L);
			session.evict(employee);  //object state change from persistent to detached state
			employee.setFirstName("Jack");
			employee.setLastName("Jackson");
			employee.setEmail("Jack@gmail.com");
			
			session.getTransaction().commit();
		}
	}
	
	public static void loadDemo() {
		Employee employee=null;
		try (Session session = factory.openSession()) {
			session.beginTransaction();
			employee = session.load(Employee.class, 206L);
			display(employee);
			session.getTransaction().commit();
		}
	}

	public static void objectStateDemo1() {
		//transient state
		Country country = new Country("T2", "TOGO");
		try (Session session = factory.openSession()) {
			session.beginTransaction();
			session.save(country); //object state changed. transient -> persist
			
			//country.setCountryName("TOGO Island");
			session.getTransaction().commit();
			System.out.println(session.contains(country));
		}
			
		Session session = factory.openSession();
		System.out.println(session.contains(country));
		//country object is in detached state
		country.setCountryName("TOGO Island");
	}
	
	private static void pause(Object msg, int second) {
		System.out.println("-----------------------"+msg+"------------------------");
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void template() {

		try (Session session = factory.openSession()) {
			session.beginTransaction();

			session.getTransaction().commit();
		}
	}
	
	private static void display(Employee e) {
		if(e==null) {
			System.out.println(e);
			return;
		}
		System.out.println(e.getFirstName()+"   "+e.getLastName()+"    "+e.getSalary());
	}

}
