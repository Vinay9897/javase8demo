package io_streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReadWrite {
    public static void main(String[] args) throws Exception {
        Reader inFile = null;
        Writer outFile = null;
        try {
            inFile = new FileReader("C:/Users/Vinay/javase8demo/src/io_streams/candidate.txt");
            outFile = new FileWriter("C:/Users/Vinay/javase8demo/src/io_streams/write.txt");

            int i = inFile.read();
            while (i != -1) {
                outFile.write(i);
                i = inFile.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inFile != null)
                inFile.close();
            if (outFile != null)
                outFile.close();
        }
    }
}
