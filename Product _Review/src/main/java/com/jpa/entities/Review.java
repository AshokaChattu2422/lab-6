package com.jpa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Review")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY  )
	private int rid;
	private String rdetails;
	@JoinColumn(name="pid_fk")
	
	@OneToMany(mappedBy="Review" ,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Product> products=new ArrayList<>();
	
	private Product product;
	public Review(String rdetails, Product product) {
		
		this.rdetails = rdetails;
		this.product = product;
	}
public Review(String rdetails) {
		
		this.rdetails = rdetails;
	}
	public Review() {
	
}
	public int getRid() {
		return rid;
	}
	
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRdetails() {
		return rdetails;
	}
	public void setRdetails(String rdetails) {
		this.rdetails = rdetails;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	

}

