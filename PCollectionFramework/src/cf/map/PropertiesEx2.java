package cf.map;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesEx2 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin=new FileInputStream("job.properties");
		Properties prop=new Properties();
		prop.load(fin);
		System.out.println(prop.getProperty("Location"));
		System.out.println(prop.getProperty("Name"));
		System.out.println("-------------------------"+prop);
		fin.close();
	}
}
