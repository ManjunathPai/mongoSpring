package com.manju.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "manjuspringboot")
public class Incident {
	
	@Id
	private String id;
	private final String incidentDescription;
	private final String developer;
	private final int impactedTransactions;
	
//	public Incident(String id, String incidentDescription, String developer, int impactedTransactions) {
//		this.incidentDescription = incidentDescription;
//		this.developer = developer;
//		this.impactedTransactions = impactedTransactions;
//	}
	
	

}
