package io_streams;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("C:/Users/Vinay/javase8demo/src/io_streams/candidate.txt");
        boolean isCreated = file.createNewFile();
        System.out.println("File created : " + isCreated);
        System.out.println("Name of the file :" + file.getName());
        System.out.println("Path of the file:" + file.getPath());
        System.out.println("is Directory : " + file.isDirectory());
        System.out.println("list : " + file.list());
    }
}
