package Elf34_maven;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class demo_add_to_cart_with_loginTest extends LaunchingbrowserTest {
@Test
	public void login() throws InterruptedException {
        
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("manojshettyn8@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Manoj@2580");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        driver.findElement(By.partialLinkText("BOOKS")).click();
        Thread.sleep(2000);//u have to use thread at a time it cant load 
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@class='text-box single-line'])[3]")).sendKeys("q spiders");
        //String text = driver.findElement(By.className("section select-billing-address")).getText();
        //same as isdigit()
        if(driver.findElement(By.id("billing-buttons-container")).isDisplayed()){
        	System.out.println("Pass: success");
        }
        
        
	}

}

