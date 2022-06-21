package elf_practicesession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_demo {
	@Test
	public void EndToEndTC(){
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");



		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		String email="manojshettyn8@gmail.com";
		String PWD="Manoj@2580";
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email)
		;
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		if(driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]")).isDisplayed());
		{
			System.out.println("In the shopcart items displayed");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();  
	}


}