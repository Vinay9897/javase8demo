package io_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedStream {
    public static void main(String[] args) throws IOException {
        Reader inFile = null;
        Writer outFile = null;
        try {
            inFile = new BufferedReader(new FileReader("C:/Users/Vinay/javase8demo/src/io_streams/candidate.txt"));
            outFile = new BufferedWriter(new FileWriter("C:/Users/Vinay/javase8demo/src/io_streams/write.txt"));
            int i = inFile.read();
            while (i != -1) {
                outFile.write(i); // Writing into the buffer
                i = inFile.read();
            }
            System.out.println("Done");

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (inFile != null)
                inFile.close();
            if (outFile != null)
                outFile.close();
        }
    }

}
