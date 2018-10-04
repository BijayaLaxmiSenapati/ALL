package com.bridgelabz.awssqs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.sqs.model.Message;
import com.bridgelabz.awssqs.services.SqsServiceImpl;

@RestController
public class AwsSqsController {

	@Autowired
	private SqsServiceImpl sqsServiceImpl;
	
	@PostMapping("/create-queue")
	public void createQueue(@RequestParam String queueName) {
		sqsServiceImpl.createQueue(queueName);
	}
	
	@PostMapping("/post-message")
	public void postMessage() {
		sqsServiceImpl.postMessageToQueue();
	}
	
	@PostMapping("/post-multiple-message")
	public void postMultipleMessage() {
		sqsServiceImpl.postMultipleMessageToQueue();
	}
	
	@GetMapping("/get-messages")
	public List<Message> getMessages() {
		List<Message> list=sqsServiceImpl.getMessages();
		return list;
	}
}
