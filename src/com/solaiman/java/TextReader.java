package com.solaiman.java;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {

    public static String text(String path) throws FileNotFoundException, IOException {
        
        String email = null;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int i = 0;
            
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                
            }
            String everything = sb.toString();
            email = everything;
            //System.out.println(email);
        }
    
    return email;
    }
    
    
    public static String [] body(String path) throws FileNotFoundException, IOException {
        
        String body[] = null;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int i = 0;
            
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                
            }
            String everything = sb.toString();
            body = everything.split("-->");
            //System.out.println(email);
        }
    
    return body;
    }
    
    
}
