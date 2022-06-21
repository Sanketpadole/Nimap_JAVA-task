package Exception;

import java.io.FileInputStream;

public class Test {
	public static void main(String [] args) {
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Desktop\\sap.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
