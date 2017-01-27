package io.github.knt5.hello.services.db;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

@Service
public class DynamoService {
	private DynamoDB dynamoDB;
	
	@PostConstruct
	public void init() {
		dynamoDB = new DynamoDB(
				AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
						new EndpointConfiguration("http://localhost:8000", "ap-northeast-1")
				).build()
		);
	}
	
	public DynamoDB getDynamoDB() {
		return dynamoDB;
	}
}
