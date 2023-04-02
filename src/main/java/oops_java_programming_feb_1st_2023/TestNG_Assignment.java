package oops_java_programming_feb_1st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Assignment {
	 
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
	}
	
	@Test
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
	}
	
	@Test
	public void clickOnRegister() {
		driver.findElement(By.linkText("Register")).click();
	}
	@Test
	public void clickOnLogin() {
		driver.findElement(By.linkText("Login")).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
