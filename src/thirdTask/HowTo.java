package thirdTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class HowTo {

    private String path;

    private RandomAccessFile file;


    public HowTo(String path){
        this.path = path;
    }

    public String readAll() throws IOException {
        file = new RandomAccessFile(path, "r");
        String result = "";
        return getString(result);
    }

    private String getString(String result) throws IOException {
        int x = file.read();
        while( x != -1){
            result += (char)x;
            x = file.read();
        }
        file.close();
        return result;
    }

    public String readFrom() throws IOException{
        file = new RandomAccessFile(path, "r");
        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("С какой страницы начнем?");
        int page = scan.nextInt();
        file.seek(1800*page);
        return getString(result);
    }
}
