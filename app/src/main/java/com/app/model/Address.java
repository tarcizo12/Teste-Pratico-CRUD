package com.app.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_ADDRESS")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "STATE", nullable = false, length = 2)
	private String state;
	
	@Column(name = "CITY", nullable = false, length = 100)
	private String	city;
	
	@Column(name = "STREET", length = 100)
	private String street;
	
	@Column(name = "NUMBER")
	private String number;
	
	@Column(name = "POSTAL_CODE" , length = 8)
	private String postalCode;
	
	@ManyToOne
	@JoinColumn(name = "ID_PERSON", nullable = false)
	private Person person;

	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", state=" + state + ", city=" + city + ", street=" + street + ", number=" + number
				+ ", postalCode=" + postalCode + "]";
	}
	
	
	
	
}
