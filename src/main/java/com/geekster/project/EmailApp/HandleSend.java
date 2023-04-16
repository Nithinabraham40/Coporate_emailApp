package com.geekster.project.EmailApp;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.project.services.Allservices;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
@Service
public class HandleSend {
	
	@Autowired
	private Allservices services;

	
	public void sendAttachment(int a) {
		
		//host : gmail is smtp
		
		String host="smtp.gmail.com";
		Properties props=System.getProperties();
		System.out.println(props);
		
		//set properties :
		
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 465);
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.auth", "true");
		
		//session
		
		Session mailSession=Session.getInstance(props,new MailAuthenticator());
		//create the message object
		MimeMessage mineMessage=new MimeMessage(mailSession);
		
		try {
			mineMessage.setFrom("nithintqwerty@gmail.com");
			mineMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(services.mailId(a)));
			
			mineMessage.setSubject(MailConstants.SUBJECT);
		
				mineMessage.setText(services.sendMailSubject(a));
			
			Transport .send(mineMessage);
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}