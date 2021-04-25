package com.solaiman.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OnlineValidation {

    public static void readURLToString() throws IOException {
        InputStream in = new URL("http://ekattorit.com/user.txt").openConnection().getInputStream();
    }
    public static void main(String[] args) {
        try {
            readURLToString();
        } catch (IOException ex) {
            Logger.getLogger(OnlineValidation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
