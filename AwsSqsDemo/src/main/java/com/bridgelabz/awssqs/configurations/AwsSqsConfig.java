package com.bridgelabz.awssqs.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

@Configuration
public class AwsSqsConfig {

	//@Value("${awsAccessKeyId}")
	private static String awsAccessKeyId="*";
	//@Value("${awsSecretAccessKey}")
	private static String awsSecretAccessKey="*";
	
	@Bean
	@Primary
	public AmazonSQS createAmazonsqs() {
		AWSCredentials credentials=new BasicAWSCredentials(awsAccessKeyId, awsSecretAccessKey);
		AmazonSQS sqs = AmazonSQSClientBuilder.standard()
				  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				  .withRegion(Regions.AP_SOUTH_1)
				  .build();
		
		return sqs;
	}
	 
}
