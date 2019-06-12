import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FirstTask {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        byte[] outData = "Hello World! It's Ilya Khimchenko.".getBytes();
        try(FileOutputStream out = new FileOutputStream(file)){
            out.write(outData);
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(file.length());

        byte[] inData = new byte[(int)file.length()];
        try (FileInputStream in = new FileInputStream("demo.txt")) {
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