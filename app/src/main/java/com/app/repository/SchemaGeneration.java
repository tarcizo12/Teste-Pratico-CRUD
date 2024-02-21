package com.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.app.model.Person;
import java.util.List;

public class SchemaGeneration {

	public static void main(String[] args) {
		System.out.print("RODOU");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppPU");
        EntityManager em = emf.createEntityManager();
        
        List<Person> lista = em.createQuery("from Person" , Person.class).getResultList();
        
        System.out.print(lista);
        
        em.close();
        emf.close();
        
	}

}
