package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Tourist;

public interface TouristRepo extends JpaRepository<Tourist,Long> {
    
}
