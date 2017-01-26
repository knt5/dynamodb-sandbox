package io.github.knt5.hello.services.db;

import javax.annotation.PostConstruct;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;

public class DynamoService {
	private AmazonDynamoDBClient client;
	
	@PostConstruct
	public void init() {
		client = new AmazonDynamoDBClient();
		client.withEndpoint("http://localhost:8000");
	}
}
