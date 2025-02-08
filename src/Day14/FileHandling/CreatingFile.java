package Day14.FileHandling;

import java.io.*;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        File file = new File("raghab.txt");
        file.createNewFile();
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        File imageFile = new File("img.png");
        System.out.println(imageFile.exists());
        File absoluteFile = imageFile.getAbsoluteFile();
        FileWriter fileWriter = new FileWriter(absoluteFile);
        fileWriter.write("How are you");
    }

}
