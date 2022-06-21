package Elf34_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class LaunchingbrowserTest {
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openchrome(@Optional("chrome")String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
			driver=new EdgeDriver();
		
		}
	}
	@AfterClass
	public void closebrowser(){
		driver.close();	
		}

}