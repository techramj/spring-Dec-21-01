package com.easylearning.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.boot.model.source.internal.hbm.AbstractEntitySourceImpl;

import com.easylearning.entities.Country;

public class JpaApplication {

	private static EntityManager em;

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("easylearning");
		em = factory.createEntityManager();

		try {
			
		} finally {
			em.close();
			factory.close();
		}
	}

	public static void addEntity() {
		EntityTransaction tx = em.getTransaction();
		Country c1 = new Country("AB", "Albenia");
		tx.begin();
		em.persist(c1);
		tx.commit();
	}

}
