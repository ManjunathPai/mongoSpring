package com.manju.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.manju.mongo.repository.IncidentRepo;

/**
 * @author paimanjunathn
 *
 */
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = IncidentRepo.class)
public class MongoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoSpringBootApplication.class, args);
	}

}
