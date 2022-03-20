import org.w3c.dom.ls.LSOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        try{
            String a ;
            Scanner input = new Scanner(System.in);
            FileOutputStream newObj = new FileOutputStream("Data.txt");
            a = "HAPPY NEW YEAR THIS YEAR";
            byte b[] = a.getBytes();
            newObj.write(b);
            newObj.close();
            System.out.println("File Created");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}