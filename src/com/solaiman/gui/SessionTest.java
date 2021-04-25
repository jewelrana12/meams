package com.solaiman.gui;

import com.solaiman.java.Tomail;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class SessionTest {
    
    static Date date;
    
    public static String getTime(){
        date = new Date();
        return date.toString();
    }

    public static Session makeSession(String from) {
        final String fromEmail = from.replace("\n", "").trim();
        final String password = "jeweltest@12";
        final String toEmail = "returnmain70@gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.secure", "true");

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        System.out.println("authenticate complete");
        Session session = Session.getInstance(props, auth);
        System.out.println(auth.toString());
        return session;
    }

    public static void main(String[] args) {
        List<MailSession> sess = new ArrayList<MailSession>();
        String mails[] = {"arifhossin2233@gmail.com", "bmondol02@gmail.com", "dipu45498@gmail.com", "ridoyg57@gmail.com", "kroy5124@gmail.com"};
        
        for(String mail:mails){
           Session temp = makeSession(mail);
           sess.add(new MailSession(temp));
            System.out.println(getTime()+" session created");
        }

    }
}
