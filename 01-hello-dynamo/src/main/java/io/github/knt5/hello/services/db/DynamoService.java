package io.github.knt5.hello.services.db;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import io.github.knt5.hello.models.auth.Session;

@Service
public class DynamoService {
	private AmazonDynamoDBClient client;
	
	@PostConstruct
	public void init() {
		client = new AmazonDynamoDBClient();
		client.withEndpoint("http://localhost:8000");
	}
	
	public void insert(Session session) {
		/*
		Item item = new Item()
				.withPrimaryKey("id", session.getId())
				.withString("userId", session.getUserId())
				.withString("lastTouchedTime", session.getLastTouchedTime());
		client.putItem("Session", item.asMap());
		*/
		Map<String, AttributeValue> item = new HashMap<>();
		item.put("id", new AttributeValue(session.getId()));
		item.put("userId", new AttributeValue(session.getUserId()));
		item.put("lastTouchedTime", new AttributeValue(session.getLastTouchedTime()));
		
		client.putItem("Session", item);
	}
}
