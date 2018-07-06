package com.bridgelabz.controller;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static void send(String email) {
		System.out.println("enterd into send email");
		//create an instance of Properties Class   
	     Properties properties = new Properties();
	     
	     /* Specifies the IP address of your default mail server
   	   for e.g if you are using gmail server as an email sever
         you will pass smtp.gmail.com as value of mail.smtp host. 
         As shown here in the code. 
         Change accordingly, if your email id is not a gmail id
      */
	     properties.put("mail.smtp.host", "smtp.gmail.com");
	     //below mentioned mail.smtp.port is optional
	     properties.put("mail.smtp.port", "587");		
	     properties.put("mail.smtp.auth", "true");
	     properties.put("mail.smtp.starttls.enable", "true");
   
   /* Pass Properties object(props) and Authenticator object   
         for authentication to Session instance 
      */
	  //   properties.setProperty("mail.smtp.host", host);  
	      Session session = Session.getDefaultInstance(properties);  
	  
	     //2).compose the message  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         //message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));  
	       //  message.setSubject("Ping"); 
	         Random random=new Random();
	         int otpNumber = random.nextInt(900000) + 100000;
	         String otp=otpNumber+"";
	         message.setText(otp);
	       // session.setAttribute("otp",otp);
	        // message.setText("Hello, this is example of sending email  ");  
	  
	         //3). Send message  
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	     
	}

}
