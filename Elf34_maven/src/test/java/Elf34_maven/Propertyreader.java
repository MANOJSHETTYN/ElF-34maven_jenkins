package Elf34_maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertyreader {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/properties");
		Properties property=new Properties();
		property.load(fis);
		System.out.println(property.getProperty("URL"));
		

	}

}
