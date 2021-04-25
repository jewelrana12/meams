package com.solaiman.java;

import java.io.File;
import java.io.FilenameFilter;


public class FolderImages {
    
    static final String[] EXTENSIONS = new String[]{
        "gif", "png", "bmp","jpg","jpeg","pdf"
    };
     static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

        @Override
        public boolean accept(final File dir, final String name) {
            for (final String ext : EXTENSIONS) {
                if (name.endsWith("." + ext)) {
                    return (true);
                }
            }
            return (false);
        }
    };

    public static File [] file(String path){
        File file = new File(path);
        File[] files = file.listFiles(IMAGE_FILTER);
        for(File f: files){
            System.out.println(f.getName());
        }
    return files;
    }
    
}