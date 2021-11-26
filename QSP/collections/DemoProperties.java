package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();

		FileInputStream fis = new FileInputStream(
				"D:\\ProjectsWorkspace\\Java\\Java\\src\\collections\\abc.properties");

		// Loads all the properties objects into the java properties
		// object p
		p.load(fis);

		// Prints the properties map object
		System.out.println(p);

		// Prints the respective value of the key dev using getKey() method
		System.out.println(p.get("dev"));

		// Prints the value of the key raj using getProperty() method
		System.out.println(p.getProperty("raj"));

		// Replaces the old value of key mad with 555 and returns the old value 333
		System.out.println(p.setProperty("mad", "555"));

		// The changes made to the properties file in the above line will be
		// sent to properties file and changes will be reflected in properties file.
		FileOutputStream fos = new FileOutputStream(
				"D:\\ProjectsWorkspace\\Java\\Java\\src\\collections\\abc.properties");
		p.store(fos, "updated by madhusudan");

	}

}
