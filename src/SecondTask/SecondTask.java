package SecondTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class SecondTask {
    public static void main(String[] args) {
        ArrayList<InputStream> arl = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++) {
            File file = new File(String.format("C:\\Users\\1\\IdeaProjects\\JavaIO\\src\\SecondTask\\%d.txt", i));
            byte[] outData = String.format("This is the %d .txt file in my task.\n", i).getBytes();
            try(FileOutputStream out = new FileOutputStream(file)){
                out.write(outData);
                arl.add(new FileInputStream(file));
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        Enumeration<InputStream> en = Collections.enumeration(arl);
        File general = new File("C:\\Users\\1\\IdeaProjects\\JavaIO\\src\\SecondTask\\general.txt");
        try (SequenceInputStream seq = new SequenceInputStream(en)){
            FileOutputStream out = new FileOutputStream(general);
            int x;
            while((x = seq.read()) != -1){
                out.write(x);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
