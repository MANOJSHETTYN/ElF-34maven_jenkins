package elf_practicesession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dropdown_action_classTest {
	@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		//Actions action=new Actions(driver);
		WebElement bookslink = driver.findElement(By.xpath("//a[contains(text(),'Books')][1]"));
		bookslink.sendKeys(Keys.ENTER);
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		dropdown.sendKeys(Keys.CONTROL.ARROW_DOWN);
		WebElement alink = driver.findElement(By.id("products-orderby"));
		alink.sendKeys(Keys.ENTER);
		alink.sendKeys(Keys.CONTROL.ARROW_DOWN);
		alink.sendKeys(Keys.ENTER);
		WebElement dropdow = driver.findElement(By.id("products-orderby"));
		String store = dropdow.getText();
		System.out.println(store);
		driver.quit();
	}

}
