package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PlanCategory;


public interface PlanCategoryRepo extends JpaRepository<PlanCategory, Integer>{
	
	

}
