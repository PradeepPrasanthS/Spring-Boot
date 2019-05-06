package com.example.demo.mail;

public abstract class MailSender {
	
	abstract void send(String to, String subject, String body);
	
}
