package com.app.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.app.model.Person;

public class PersonRepository implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    public PersonRepository() {}

    public PersonRepository(EntityManager manager) {
        this.manager = manager;
    }

    public Person findById(Long id) {
        return manager.find(Person.class, id);
    }

    public List<Person> searchByName(String name) {
        String jpql = "from Person where name like :name";
        
        TypedQuery<Person> query = manager.createQuery(jpql, Person.class);
        
        query.setParameter("name", name + "%");
        
        return query.getResultList();
    }

    public Person save(Person person) {
        return manager.merge(person);
    }

    public void delete(Person person) {
        person = findById(person.getId());
        manager.remove(person);
    }
}
