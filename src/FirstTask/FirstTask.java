package FirstTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FirstTask {
    public static void main(String[] args) {
        String path = "C:\\Users\\1\\IdeaProjects\\JavaIO\\src\\FirstTask\\demo.txt";
        File file = new File(path);

        byte[] outData = "Hello World! It's Ilya Khimchenko.".getBytes();
        try(FileOutputStream out = new FileOutputStream(file)){
            out.write(outData);
        } catch (IOException e){
            e.printStackTrace();
        }

        byte[] inData = new byte[(int)file.length()];
        try (FileInputStream in = new FileInputStream(path)) {
            int x;
            while ((x = in.read(inData)) > 0){
                for (int i = 0; i < x; i++) {
                    System.out.print((char) inData[i]);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}