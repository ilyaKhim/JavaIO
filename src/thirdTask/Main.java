package thirdTask;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        HowTo test = new HowTo("C:\\Users\\1\\IdeaProjects\\JavaIO\\src\\thirdTask\\test.txt");
        try {
            System.out.println(test.readFrom());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
