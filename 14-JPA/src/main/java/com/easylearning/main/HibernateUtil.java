package com.easylearning.main;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.easylearning.entities.Country;
import com.easylearning.entities.Department;
import com.easylearning.entities.Employee;
import com.easylearning.entities.Location;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Country.class);
		configuration.addAnnotatedClass(Location.class);
		configuration.addAnnotatedClass(Department.class);
		configuration.addAnnotatedClass(Employee.class);
		
	
		
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
	}
	
	private HibernateUtil() {}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
