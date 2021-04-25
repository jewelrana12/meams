package com.solaiman.java.mail;



import com.solaiman.java.Tomail;
import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class TLSEmail {
	public static void send(String from,String body, File[] image) {
		final String fromEmail = from.replace("\n", "").trim();
		//final String fromEmail = "smensulaiman007@gmail.com";
		final String password = Tomail.pass;
		//final String toEmail = "jewelwork7@gmail.com";
                final String toEmail = Tomail.toMail;
                
                //System.out.println("Your Email is "+toEmail);
                //System.out.println("Your Subject is "+Tomail.sub);
                //System.out.println("Your Password is "+Tomail.pass);
		
		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.secure", "true");

		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
                System.out.println("authentication found");
		Session session = Session.getInstance(props, auth);	
		EmailUtil.sendEmail(session,fromEmail, toEmail,Tomail.sub, body, image);
	}


	
}
