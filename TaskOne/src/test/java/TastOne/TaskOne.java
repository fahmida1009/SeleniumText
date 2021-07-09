package TastOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TaskOne {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		//URL & page title of the URL
		System.out.println("The website is: " +driver.getCurrentUrl());
		
		//The page title
		System.out.println("The page title of the website is: " +driver.getTitle());
		
		
		//Another URL
		driver.navigate().to("https://www.nexchar.com/");
		
		Thread.sleep(5000);
	
		
		//Refresh page
		driver.navigate().refresh();

}
}
