package finally_block;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCloseDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream(" C:\\Users\\Asus\\Desktop\\sapm.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		finally
		{
			if (fis!=null)
			{
				fis.close();
			}
			System.out.println("file closed");
		}
	}

}
