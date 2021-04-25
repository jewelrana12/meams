package com.solaiman.java;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;

public class Item {  
    
    private String email;
    private String body;
    private File image[];

    public Item() {
    }

    public Item(String email, String body, File [] image) {
        this.email = email;
        this.body = body;
        this.image = image;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public File[] getImage() {
        return image;
    }

    public void setImage(File[] image) {
        this.image = image;
    }
    
}
