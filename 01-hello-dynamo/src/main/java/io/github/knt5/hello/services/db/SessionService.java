package io.github.knt5.hello.services.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.knt5.hello.models.auth.Session;

@Service
public class SessionService {
	@Autowired
	private DynamoService dynamoService;
	
	public void insert(Session session) {
		dynamoService.insert(session);
	}
}
