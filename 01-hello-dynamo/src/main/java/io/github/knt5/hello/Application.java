package io.github.knt5.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.knt5.hello.models.auth.Session;
import io.github.knt5.hello.services.auth.AuthService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private AuthService authService;
	
	private Session session;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		session = authService.login("userId", "password");
	}
}
