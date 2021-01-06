package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jpa.entities.Location;

public interface LocationRepo extends JpaRepository<Location,Integer> {

}
