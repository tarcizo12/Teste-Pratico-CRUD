package com.app.repository;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.app.model.Address;
import com.app.model.Person;

public class PersistenceLayer {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Declarando os repositórios
        PersonRepository personRepository = new PersonRepository(em);
        AddressRepository addressRepository = new AddressRepository(em);

        // Criando uma pessoa
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(LocalDate.of(1990, 5, 15));
        person.setGender("M");

        // Salvando a pessoa antes de associar os endereços
        personRepository.save(person);

//        // Criando endereços para a pessoa
//        Address address1 = new Address();
//        address1.setState("CA");
//        address1.setCity("San Francisco");
//        address1.setStreet("123 Main St");
//        address1.setNumber("1");
//        address1.setPostalCode("12345");
//        address1.setPerson(person);
//
//        Address address2 = new Address();
//        address2.setState("NY");
//        address2.setCity("New York");
//        address2.setStreet("456 Oak St");
//        address2.setNumber("2");
//        address2.setPostalCode("67890");
//        address2.setPerson(person);
//
//        // Salvando os endereços
//        addressRepository.save(address1);
//        addressRepository.save(address2);
//
//        em.getTransaction().commit();

        // Verificando se a inserção funcionou
        List<Person> people = personRepository.searchByName("John");
        System.out.println(people);

        em.close();
        emf.close();
    }
}
