package Elf34_maven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class datadriven_xl_reading extends LaunchingbrowserTest{
	@Test(dataProvider="TestData")
	public void Testcase(String email,String password) {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()){
			System.out.println("Pass: user logged in successfully");
		}else{
			System.out.println("Fail: User not logged in successfully");
		}
		driver.close();
	}

	@DataProvider(name="TestData",parallel=true)
	public Object[][] main() throws EncryptedDocumentException, IOException {
		return WorkingWithMultipleRead.data1("Login"); 
	}
}


