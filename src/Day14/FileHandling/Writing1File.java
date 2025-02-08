package Day14.FileHandling;

import java.io.*;

public class Writing1File {
    public static void main(String[] args) throws IOException {
       InputStreamReader inputStreamReader = new InputStreamReader(System.in);
       // Reading from the console. InputStreamReader reads the byte data and converts into the character data
        System.out.println("Enter some letters:");
        int letters =1;
        inputStreamReader.read();
        System.out.println(inputStreamReader.ready());
       while(inputStreamReader.ready()){
           System.out.println((char)letters);
          letters=  inputStreamReader.read();
           System.out.println(inputStreamReader.ready());
       }
        System.out.println();

      inputStreamReader.close();

        // FileReader is used to read the file.
        FileWriter fileWriter1 = new FileWriter("raghab.txt");
        fileWriter1.write("hello raghab");
        fileWriter1.close();

        FileWriter fileWriter = new FileWriter(new File("raghab.txt"));
        StringBuilder text;
        while (true){
            System.out.println("Enter the text you want to write in the file.");
           int a = inputStreamReader.read();
           // Reads all the letters of console
           text = new StringBuilder(String.valueOf((char) a));
            while(inputStreamReader.ready()){
                text.append((char) inputStreamReader.read());
            }
            fileWriter.write(text.toString());
            System.out.println("Do you want to write more text y for yes and anykey for no");
            InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
            String  yesOrNo = String.valueOf((char)inputStreamReader1.read()).toLowerCase();
            if (yesOrNo.equals("y")){

            }else {
                fileWriter.close();
                break;
            }
        }

    }
}
