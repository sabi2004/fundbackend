package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Fund;

@Repository
public interface FundRepo extends JpaRepository<Fund, Integer> {

}