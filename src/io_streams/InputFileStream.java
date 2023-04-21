package io_streams;

import java.io.File;
import java.io.FileInputStream;

public class InputFileStream {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("C:/Users/Vinay/javase8demo/src/io_streams/candidate.txt");
        FileInputStream file2 = new FileInputStream("C:/Users/Vinay/javase8demo/src/io_streams/write.txt");

        int i = file.read();

        while (i != -1) {
            System.out.print((char) i);
            // Read the next byte
            i = file.read();
        }
        file.close();

        int j = file2.read();

        while (j != -1) {
            System.out.print((char) j);
            // Read the next byte
            j = file2.read();
        }
        file2.close();
    }
}
