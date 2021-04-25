package com.solaiman.java;

import java.io.File;
import java.io.FilenameFilter;

public class GetFolderNames {
    public static String [] get(String path) {
        File file = new File(path);
        String [] directorys = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
               return new File(dir,name).isDirectory();
            }
        });
        int i;
        String temp;
        for(i=0;i<directorys.length;i++){
            temp=directorys[i];
            directorys[i]=path+"\\"+temp;
            System.out.println(directorys[i]);
        }
        
        return directorys;
    }
    public static void main(String[] args) {
        get("C:\\Users\\Solaiman\\Desktop\\image");
    }
}
