package QAmonCodeTestByFahmidaFarzana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import QAmonCodeTestByFahmidaFarzana.SignInPageObjectLocator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignPagePomTestNG {
	
//public static void main(String[] args) {
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.acquireangel.com/signin");
		
		// Username test action
		SignInPageObjectLocator.email(driver).sendKeys("hamidsaymon9@gmail.com");
		
		// Password test action
		SignInPageObjectLocator.password(driver).sendKeys("Abc12345");
		
		// Remember me test action
		SignInPageObjectLocator.rememberme(driver).click();
		
		// Sign in button test action
		SignInPageObjectLocator.signinbutton(driver).click();
		}
		*/
		
		//Use the @BeforeTest, @Test, @AfterTest annotation
		// create class variable
		WebDriver driver=null;
		
		// Before test function
		
			@BeforeTest
			public void setUpTest()
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
		
			//Test function
			
			@Test
			public void testStep1() throws InterruptedException
			{
				driver.get("https://www.acquireangel.com/signin");
				
				//Email test action
				SignInPageObjectLocator.email(driver).sendKeys("hamidsaymon9@gmail.com");
				
				//Password test action
				SignInPageObjectLocator.password(driver).sendKeys("Abc12345");
				
				//Remember me test action
				SignInPageObjectLocator.rememberme(driver).click();
				
				//Sign in button test action
				SignInPageObjectLocator.signinbutton(driver).click();
				
				Thread.sleep(3000);
			}
			
			
		//Close function
			@AfterTest
			public void tearDown()
		{
			driver.close();
		}

}

