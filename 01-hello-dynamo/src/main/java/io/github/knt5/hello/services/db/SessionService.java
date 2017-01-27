package io.github.knt5.hello.services.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

import io.github.knt5.hello.models.auth.Session;

@Service
public class SessionService {
	@Autowired
	private DynamoService dynamoService;
	
	public void insert(Session session) {
		Table table = dynamoService.getDynamoDB().getTable("Session");
		
		Item item = new Item()
				.withString("id", session.getId())
				.withString("userId", session.getUserId())
				.withString("lastTouchTime", session.getLastTouchTime());
		
		table.putItem(item);
	}
}
