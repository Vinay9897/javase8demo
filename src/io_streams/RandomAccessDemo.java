package io_streams;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomFile = new RandomAccessFile("C:/Users/Vinay/javase8demo/src/io_streams/candidate.txt",
                "rw");
        randomFile.writeUTF("Hello");
        System.out.println("Current Position :" + randomFile.getFilePointer());
        randomFile.seek(0);
        System.out.println(randomFile.readUTF());
        System.out.println("Current position:" + randomFile.getFilePointer());
        randomFile.close();
    }
}
