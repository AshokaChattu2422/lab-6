package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.entities.Customer;
import com.jpa.entities.Product;
import com.jpa.entities.Review;
import com.jpa.repo.CustomerRepo;
import com.jpa.repo.ProductRepo;
import com.jpa.repo.ReviewRepo;

@SpringBootApplication
public class CustomerToProductApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepo customerRepo ;
	@Autowired
	private ProductRepo productRepo ;

	@Autowired
	private ReviewRepo reviewRepo ;


	public static void main(String[] args) {
		SpringApplication.run(CustomerToProductApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		Product p1=new Product("TV",7000.00);
		Product p2=new Product("Freezer",9000.00);
		Product p3=new Product("Cooler",8000.00);
		

		//Customer c1=new Customer("Ashoka",p1);
		//Customer c2=new Customer("Chattu",p2);
		//Customer c3=new Customer("Pooja",p3);
		//Customer c4=new Customer("Charu",p2);
		
		Review r1=new Review("Gud",p1);
		Review r2=new Review("Gud",p2);
		Review r3=new Review("Gud",p3);
		
		//p2.getCustomers().add(c2);
		//p2.getCustomers().add(c4);
		
		
		productRepo .save(p1);
		productRepo .save(p2);
		productRepo .save(p3);
		
		
		//customerRepo.save(c1);
		//customerRepo.save(c2);
		//customerRepo.save(c3);
		//customerRepo.save(c4);
		
		
		reviewRepo.save(r1);
		reviewRepo.save(r2);
		reviewRepo.save(r3);
		
		
	}


}
