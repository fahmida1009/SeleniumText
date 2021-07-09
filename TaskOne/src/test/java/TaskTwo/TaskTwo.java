package TaskTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {
	
	//Main Method Create
public static void main(String[] args) throws InterruptedException{
	
	//Use the webdriverManager denpendency
	WebDriverManager.chromedriver().setup();
	
	//Webdriver object create
	WebDriver driver= new ChromeDriver();
	
	//visit the URL
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	
	//window full screen
	driver.manage().window().maximize();
	
	//Click on the "Make Appointment" button.
	driver.findElement(By.id("btn-make-appointment")).click();
	
	//Fill up the username
	driver.findElement(By.id("txt-username")).sendKeys("John Doe");
	
	//password input box
	driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");

	//Click on the "Login" button.
	driver.findElement(By.id("btn-login")).click();
	
	Thread.sleep(5000);
	
	//Quit the browser
	driver.quit();
	
}

}
