package com.geekster.project.EmailApp;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {
	

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		 
		  return new PasswordAuthentication("nithintqwerty@gmail.com", "upkscrwnwfrdlzoh");
		
	}

}

