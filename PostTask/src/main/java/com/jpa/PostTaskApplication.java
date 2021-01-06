package com.jpa;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.entities.Location;
import com.jpa.entities.Posts;
import com.jpa.entities.User;
import com.jpa.repo.LocationRepo;
import com.jpa.repo.PostsRepo;
import com.jpa.repo.UserRepo;

@SpringBootApplication
public class PostTaskApplication  implements CommandLineRunner {
 @Autowired
 private UserRepo userRepo ;
 @Autowired
 private PostsRepo postsRepo ;
 @Autowired
 private LocationRepo locationRepo ;
	

	public static void main(String[] args) {
		SpringApplication.run(PostTaskApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		Location l1=new Location("ap");
		Location l2=new Location("tpt");
		
		Posts p1=new Posts("speed post",LocalDate.of(2020, Month.JANUARY, 5));
		Posts p2=new Posts("Register post",LocalDate.of(2020, Month.JANUARY, 6));
		Posts p3=new Posts("Normal post",LocalDate.of(2020, Month.JANUARY, 6));
		Posts p4=new Posts("Teligram",LocalDate.of(2020, Month.JANUARY, 6));
		
		User u1=new User("Ashoka","Chattu","ashoka@gmail.com");
		User u2=new User("pooja","sarath","pooja@gmail.com");
		User u3=new User("pooja","sarath","pooja@gmail.com");
		User u4=new User("pooja","sarath","pooja@gmail.com");
		
		
		//u1.getLocation().add(l1);
		//u2.getLocation().add(l2);
		
		p1.getUsers().add(u1);
		p2.getUsers().add(u1);
		
		p3.getUsers().add(u2);
		p4.getUsers().add(u2);
		
		
		p1.getUsers().add(u3);
		p2.getUsers().add(u4);
		
		
		l1.getUsers().add(u1);
		l1.getUsers().add(u2);
		
		l2.getUsers().add(u3);
		l2.getUsers().add(u4);
		
		
		userRepo.save(u1);
		userRepo.save(u2);
		userRepo.save(u3);
		userRepo.save(u4);
		
		
		postsRepo.save(p1);
		postsRepo.save(p2);
		postsRepo.save(p3);
		postsRepo.save(p4);
		
		
		locationRepo.save(l1);
		locationRepo.save(l2);
		
		
		
		
		
		

}
}