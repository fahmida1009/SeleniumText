package QAmonCodeTestByFahmidaFarzana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementExecutionTest {
	
	//Main Method Create
	public static void main(String[] args) throws InterruptedException{
	
	//Use the webdriverManager denpendency
		WebDriverManager.chromedriver().setup();
		
		//Web-driver object create
		WebDriver driver= new ChromeDriver();
		
		//window full screen
		driver.manage().window().maximize();
		
		//visit the URL
		driver.get("https://www.nexchar.com/signup");
		
		//SignUp
		
		//Fill up the username
		driver.findElement(By.id("Name")).sendKeys("Shafi");
				
		//Fill up the email
	    driver.findElement(By.id("Email")).sendKeys("Shafi@yopmail.com");
	    
	  //Fill up the password
	    driver.findElement(By.id("Password")).sendKeys("123456");

		//Click on the "SignUp" button.
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//open the new tab
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.nexchar.com/signin");
		
		//Login
		//Fill up the email
	    driver.findElement(By.id("Email")).sendKeys("Shafi@yopmail.com");
	    
	  //Fill up the password
	    driver.findElement(By.id("Password")).sendKeys("123456");
	    
	    //remember me
	    driver.findElement(By.id("RememberMe")).click();
	    
	  //Login button
	    driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	    
	    driver.navigate().back();
	    driver.navigate().refresh();
	    
	    //launch another URL for sign up
		driver.get("https://www.nexchar.com/signup");
				
		//Fill up the username
		driver.findElement(By.id("Name")).sendKeys("Lidia");
						
		//Fill up the email
	    driver.findElement(By.id("Email")).sendKeys("lidia@yopmail.com");
			    
		//Fill up the password
		driver.findElement(By.id("Password")).sendKeys("123456");

		//Click on the "SignUp" button.
		driver.findElement(By.cssSelector("button[type='submit']")).click();
				
		//open the new tab
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.nexchar.com/signin");
				
		//Fill up the email
		 driver.findElement(By.id("Email")).sendKeys("lidia@yopmail.com");
			    
		//Fill up the password
	    driver.findElement(By.id("Password")).sendKeys("123456");
			    
		 //Login button
		 driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

	   
	    
}
}
