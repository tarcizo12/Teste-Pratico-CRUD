package com.app.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.app.model.Address;

public class AddressRepository implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    public AddressRepository() {}

    public AddressRepository(EntityManager manager) {
        this.manager = manager;
    }

    public List<Address> searchByDescription(String description) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

        CriteriaQuery<Address> criteriaQuery = criteriaBuilder.createQuery(Address.class);
        Root<Address> root = criteriaQuery.from(Address.class);
        
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.like(root.get("POSTAL_CODE"), description + "%"));

        TypedQuery<Address> query = manager.createQuery(criteriaQuery);

        return query.getResultList();
    }

    public Address save(Address address) {
        return manager.merge(address);
    }

    public void delete(Address address) {
        address = findById(address.getId());
        manager.remove(address);
    }

    public Address findById(Long id) {
        return manager.find(Address.class, id);
    }
}
