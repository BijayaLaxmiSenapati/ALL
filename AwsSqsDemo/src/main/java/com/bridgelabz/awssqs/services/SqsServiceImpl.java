package com.bridgelabz.awssqs.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.MessageAttributeValue;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageRequest;

@Service
public class SqsServiceImpl {

	@Autowired
	public AmazonSQS sqs;
	public static String standardQueueUrl;

	public String createQueue(String queueName) {
		CreateQueueRequest createStandardQueueRequest = new CreateQueueRequest(queueName);
		standardQueueUrl = sqs.createQueue(createStandardQueueRequest).getQueueUrl();
		return standardQueueUrl;
	}

	public void createFIFOQueue() {
		Map<String, String> queueAttributes = new HashMap<>();
		queueAttributes.put("FifoQueue", "true");
		queueAttributes.put("ContentBasedDeduplication", "true");
		CreateQueueRequest createFifoQueueRequest = new CreateQueueRequest("baeldung-queue.fifo")
				.withAttributes(queueAttributes);
		String fifoQueueUrl = sqs.createQueue(createFifoQueueRequest).getQueueUrl();
	}

	public void postMessageToQueue() {
		Map<String, MessageAttributeValue> messageAttributes = new HashMap<>();
		messageAttributes.put("AttributeOne",
				new MessageAttributeValue().withStringValue("This is an attribute").withDataType("String"));

		SendMessageRequest sendMessageStandardQueue = new SendMessageRequest().withQueueUrl(standardQueueUrl)
				.withMessageBody("A simple message.2222").withMessageAttributes(messageAttributes);

		sqs.sendMessage(sendMessageStandardQueue);
	}

	public void postMultipleMessageToQueue() {

		List<SendMessageBatchRequestEntry> messageEntries = new ArrayList<>();
		messageEntries.add(new SendMessageBatchRequestEntry().withId("id-1").withMessageBody("batch-1")
				.withMessageGroupId("baeldung-group-1"));
		messageEntries.add(new SendMessageBatchRequestEntry().withId("id-2").withMessageBody("batch-2")
				.withMessageGroupId("baeldung-group-1"));

		SendMessageBatchRequest sendMessageBatchRequest = new SendMessageBatchRequest(standardQueueUrl, messageEntries);
		sqs.sendMessageBatch(sendMessageBatchRequest);
	}

	public List<Message> getMessages() {

		ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(standardQueueUrl)
				.withMaxNumberOfMessages(10);

		List<Message> sqsMessages = sqs.receiveMessage(receiveMessageRequest).getMessages();
		return sqsMessages;
	}
}
