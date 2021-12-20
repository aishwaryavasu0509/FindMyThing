
package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TourismModule;

@Repository
public interface TourismRepository extends MongoRepository<TourismModule,String> {

	

	

	

}
