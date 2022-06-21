package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_property_reader {

	public static String read(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/properties");
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty("URL");
		

	}

}

