package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.JobseekerModule;

@Repository
public interface JobseekerRepository extends MongoRepository<JobseekerModule,String>{
	
}
