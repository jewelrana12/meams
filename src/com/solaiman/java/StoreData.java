package com.solaiman.java;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StoreData {

   
    String [] emails;
    String [] body;
    List<File[]> file;

    public StoreData(String[] emails, String[] body, List<File[]> file) {
        this.emails = emails;
        this.body = body;
        this.file = file;
    }

    public List<File[]> getFile() {
        return file;
    }

    public void setFile(List<File[]> file) {
        this.file = file;
    }

    public StoreData() {
        this.file = new ArrayList<File[]>();
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public String[] getBody() {
        return body;
    }

    public void setBody(String[] body) {
        this.body = body;
    }

 
     public List <Item> storeItem() {
         int i=0;
         List <Item> list =  new ArrayList<Item>();
         for(String email:emails){
             try{
             File [] newfile = file.get(i);
             list.add(new Item(email,body[i],newfile));
             }catch(Exception e){
                 
             }
             i++;
         }
         return list;
    }

}
