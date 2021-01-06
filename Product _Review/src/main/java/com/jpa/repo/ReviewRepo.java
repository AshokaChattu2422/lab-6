package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.Review;

public interface ReviewRepo extends JpaRepository<Review,Integer> {

}
