package io.github.knt5.hello.services.auth;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import io.github.knt5.hello.models.auth.Session;

@Service
public class AuthService {
	private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
	
	public Session login(String userId, String password) {
		// login
		
		
		String sessionId = "xxx";
		
		Session session = new Session(sessionId, userId, formatter.format(new Date()));
		
		// Insert session to DB
		
		
		return session;
	}
	
	public void touch(Session session) {
		// Update lastTouchedTime of session by id DB
		
	}
	
	public void logout(Session session) {
		// Delete session from DB
		
	}
}
