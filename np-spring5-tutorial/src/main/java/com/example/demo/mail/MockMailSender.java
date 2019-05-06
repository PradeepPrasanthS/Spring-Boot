package com.example.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSender extends MailSender {
	
	
	private static Log Log = LogFactory.getLog(MockMailSender.class);
	
	@Override
	public void send(String to, String subject, String body) {
		
		Log.info("Sending MOCK mail to " + to);
		Log.info("with subject " + subject);
		Log.info("and body " + body);
	}
}
