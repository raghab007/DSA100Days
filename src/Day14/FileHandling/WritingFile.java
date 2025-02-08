package Day14.FileHandling;

import java.io.*;
import java.util.Scanner;

public class WritingFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("raghab.txt");
            FileReader fileReader = new FileReader("raghab.txt");

            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(""));
            Scanner scanner = new Scanner(System.in);
            int i = 1;
            while(i<11){
                System.out.println("Enter the text you want to write in the file:");
                String s = scanner.nextLine();
                System.out.println(s);
                fileWriter.write(s+"\n");i++;
            }
            fileWriter.close();
        }
        catch (IOException exception){
            System.out.println(exception);
        }

    }
}
