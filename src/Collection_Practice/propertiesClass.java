package Collection_Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class propertiesClass {
	public static void main(String args[]) throws IOException {
		
		Properties pi = new Properties();
		
		FileInputStream fis = new FileInputStream("..\\java_project\\src\\test.properties");
		pi.load(fis);
		System.out.println(pi.getProperty("user") + " : " + pi.getProperty("password"));
		
		//p.setProperty("user", "mypassword");
		
		Properties po = new Properties();
		FileOutputStream fos = new FileOutputStream("..\\java_project\\src\\test.properties");
		po.setProperty("user", "myuser");
		po.setProperty("password", "mypassword");
		po.store(fos, "test");
		
		System.out.println(po.getProperty("user") + " : " + po.getProperty("password"));
		
	
		
		// System.out.println(p.getProperty("password"));

	//	Iterator irt = (Iterator) p.propertyNames();
		/*
		 * while(irt.hasNext()) { String s=(String)irt.next(); System.out.println(s); }
		 */

		/*
		 * Enumeration e = p.propertyNames(); while (e.hasMoreElements()) { String s =
		 * (String) e.nextElement(); System.out.println(s); }
		 */

	}
}
