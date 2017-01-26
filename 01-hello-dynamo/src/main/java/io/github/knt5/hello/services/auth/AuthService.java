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
		
		return new Session(sessionId, userId, formatter.format(new Date()));
	}
	
	public void touch(Session session) {
		
	}
	
	public void logout(Session session) {
		
	}
}
