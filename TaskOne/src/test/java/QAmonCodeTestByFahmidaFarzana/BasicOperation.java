package QAmonCodeTestByFahmidaFarzana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicOperation {
	
	//Main Method Create
public static void main(String[] args) throws InterruptedException{
	
	//Use the webdriverManager denpendency
	WebDriverManager.chromedriver().setup();
	
	//Web-driver object create
	WebDriver driver= new ChromeDriver();
	
	//window full screen
	driver.manage().window().maximize();
	
	//visit the URL
	driver.get("https://www.demoblaze.com/index.html");
	
	//URL & page title of the URL
	System.out.println("The page title of the website is: " +driver.getTitle());
	System.out.println("The website is: " +driver.getCurrentUrl());
	
	//Another URL
	driver.navigate().to(" https://opensource-demo.orangehrmlive.com/");
	
	//Refresh page
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	//open the new tab
	driver.switchTo().newWindow(WindowType.TAB).get("https://www.aftercareexplained.com/");
	
	//visit a URL in the new Tab
	driver.switchTo().newWindow(WindowType.TAB).get("https://www.chhoto.link/");
	
	Thread.sleep(3000);
	
	//CLose the current tab
	driver.close();

	Thread.sleep(3000);

	//Quit the browser
	driver.quit();
	
}

}
