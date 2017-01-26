package io.github.knt5.hello.services.auth;

import org.springframework.stereotype.Service;

import io.github.knt5.hello.models.auth.Session;

@Service
public class AuthService {
	public Session login() {
		Session session = new Session();
		return session;
	}
	
	public void touch(Session session) {
		
	}
	
	public void logout(Session session) {
		
	}
}
