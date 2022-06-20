package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
	public static void main(String [] args) throws FileNotFoundException {
		FileReader f=new FileReader("C:\\Users\\Asus\\Desktop\\seminar1.txt"); 
			try {
				System.out.println(f.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
		

