package com.jpa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	public Location() {
		
	}
	public Location(String lname) {
		
		this.lname = lname;
	}
	public Location(String lname, List<User> users) {
		
		this.lname = lname;
		this.users = users;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	private String lname;
	@OneToMany
	private List<User> users=new ArrayList<>();
	public void add(Location location) {
		// TODO Auto-generated method stub
		
	}

}
