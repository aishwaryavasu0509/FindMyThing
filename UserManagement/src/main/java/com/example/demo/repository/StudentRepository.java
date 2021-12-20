
package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentModule;

@Repository
public interface StudentRepository extends MongoRepository<StudentModule,String>{
	
}
