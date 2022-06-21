package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	public static void main(String [] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Desktop\\sap.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
