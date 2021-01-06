package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jpa.entities.Posts;

public interface PostsRepo extends JpaRepository<Posts,Integer> {

}
