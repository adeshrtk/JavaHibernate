package com.javatut.connection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int Id;
	private String Name;
	private String City;
	
	private Certificate certificate;
	
	public Teacher(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	
	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Teacher [Id=" + Id + ", Name=" + Name + ", City=" + City + "]";
	}
	
	
}
