package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("C:\\Users\\Asus\\Desktop\\seminar.txt");
            file.read();
//            file.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}


