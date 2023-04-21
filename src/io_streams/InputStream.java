package io_streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:/Users/Vinay/javase8demo/src/io_streams/candidate.txt")));
            System.out.println("Data in the file is:");
            int data = br.read();
            while (data != -1) { // Checking for the end of file
                System.out.print((char) data);
                data = br.read(); // Reading the content
            }
        } catch (IOException ioe) {
            System.err.println("ERROR: " + ioe.getMessage());
        } finally {
            if (br != null)
                br.close();
        }

    }
}
