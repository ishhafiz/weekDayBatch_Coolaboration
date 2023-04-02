 package testng_hardvssoft_asserts_feb_7th_2023;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rediff_Assart {

	public static WebDriver driver;
	public static SoftAssert softassert;
	
	@BeforeMethod
	public void rediffWebPage() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void reddifTest() {
		softassert = new SoftAssert();
		String expectedTitle = driver.getTitle();
		String actualTitle ="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
//		Assert.assertEquals(expectedTitle, actualTitle, "check my code again  "); // using hard assertion.
//		if(expectedTitle.equals(actualTitle)) {
//			driver.findElement(By.linkText("Sign in")).click();
		softassert.assertEquals(expectedTitle, actualTitle, "check my code again  ");
			if(expectedTitle.equals(actualTitle)) {
				driver.findElement(By.linkText("Sign in")).click();
		}
			softassert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
