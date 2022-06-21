package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
	public static void main(String [] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Desktop\\sam.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

//
//
//we hv surrounded here with try and catch block and hence it is showing filenot found exception because sam.txt doesnt exist in our system
