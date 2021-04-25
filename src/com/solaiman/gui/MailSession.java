package com.solaiman.gui;

import javax.mail.Session;

public class MailSession {
    Session session;

    public MailSession(Session session) {
        this.session = session;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
}
