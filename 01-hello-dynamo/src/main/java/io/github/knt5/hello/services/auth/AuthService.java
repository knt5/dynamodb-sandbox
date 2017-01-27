package io.github.knt5.hello.services.auth;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.knt5.hello.models.auth.Session;
import io.github.knt5.hello.services.db.SessionService;

@Service
public class AuthService {
	private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
	
	@Autowired
	private SessionService sessionService;
	
	public Session login(String userId, String password) {
		// login mock
		// String sessionId = foo.login(userId, password);
		String sessionId = "xxxxx-xxxxx-session-id-xxxxx-xxxxx";
		
		// Create session
		Session session = new Session(sessionId, userId, formatter.format(new Date()));
		
		// Insert session to DB
		sessionService.insert(session);
		
		return session;
	}
	
	public void touch(Session session) {
		// Update lastTouchTime
		
	}
	
	public void logout(Session session) {
		// Delete session from DB
		
	}
}
