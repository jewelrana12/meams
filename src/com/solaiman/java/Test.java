package com.solaiman.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    
    public static void main(String[] args) {
        String totalTime  = "11-48-12";
        String[] sepTime = totalTime.split("-");
        SimpleDateFormat ft = new SimpleDateFormat("hh-mm-ss");
        Date date1 = new Date();
        String date = ft.format(date1);
        String[] sepTime1 = date.split("-");
        
        if((sepTime[0].equals(sepTime1[0])) && (sepTime[1].equals(sepTime1[1])) && (Integer.parseInt(sepTime1[2])>=Integer.parseInt(sepTime[2]))){
        System.out.println(date);
        }
    }
    
}
