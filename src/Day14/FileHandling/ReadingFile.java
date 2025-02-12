package Day14.FileHandling;

import java.io.*;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        System.out.println("how how how");
        // This is used to write byte data into the file.It automatically converts the byte data into character
        // This removes the manual process
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("raghab.txt"));
        outputStreamWriter.write("Hello");
        // Using only the
        FileOutputStream fileOutputStream = new FileOutputStream("raghab.txt");
        fileOutputStream.write(new byte[]{1,2,3,4,5});

    }
}
