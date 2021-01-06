package com.jpa.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Posts")
public class Posts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	public Posts() {
		
	}
	public Posts(String details, LocalDate date) {
		
		this.details = details;
		this.date = date;
	}
	private String details;
	public Posts(String details, LocalDate date, List<User> users) {
		
		this.details = details;
		this.date = date;
		this.users = users;
	}
	private LocalDate  date;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	//@JoinColumn(name="id_fk")
	//@JoinTable(name="post_loc",joinColumns=@JoinColumn(name="pid_fk"),inverseJoinColumns=@JoinColumn(name="lid_fk"))
	@OneToMany
	private List<User> users=new ArrayList<>();
}
