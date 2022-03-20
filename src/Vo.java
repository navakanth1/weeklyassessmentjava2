
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Vo {
    public static void main(String[] args) {
        Integer count = 0;
        try{
            FileInputStream show = new FileInputStream("Data.txt");
            int i=0;
            while((i=show.read())!=-1){
                if(((char)i) == 'A'|| ((char)i) == 'E'|| ((char)i) == 'I' ||((char)i) == 'O' ||((char)i) == 'U'){
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of vowels in the given sentence is "+count);
    }
}