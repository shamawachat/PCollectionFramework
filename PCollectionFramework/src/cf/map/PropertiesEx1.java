package cf.map;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesEx1 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("job.properties");
		Properties prop=new Properties();
		
		prop.setProperty("Location", "C Drive");
		prop.setProperty("Name", "Sham");
		prop.store(fout, "Configuration Data");
		
		fout.close();
		System.out.println("File Created & Closed!");
	}
}
