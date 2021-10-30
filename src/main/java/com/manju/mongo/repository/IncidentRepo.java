package com.manju.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manju.mongo.model.Incident;

public interface IncidentRepo extends MongoRepository<Incident, String>{

}
