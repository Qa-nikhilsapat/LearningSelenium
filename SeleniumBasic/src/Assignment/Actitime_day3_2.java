package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//
//Perform following operations on the application
//
//1. Open any browser
//2. Enter the url as https://demo.actitime.com/login.do
//3. Verify login page
//3. Username as admin
//4. password as manager
//5. click on Login button 
//6. close the brows
public class Actitime_day3_2 {
	public static void main(String[]args) {
		String s1= System.getProperty("user.dir")+
				"\\Executibles\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s1);
		WebDriver call = new ChromeDriver();
		call.get("https://demo.actitime.com/login.do");
		
		String s2= call.getTitle();
		System.out.println("Title: "+s2 +"\nTitle length: "+s2.length());
		
		String s3=call.getCurrentUrl();
		System.out.println("URL: "+s3 +"\nLength: "+s3.length());
		WebElement ref = call.findElement(By.id("username"));
		ref.clear();
		ref.sendKeys("admin");
		//WebElement ref1 = call.findElement(By.name("pwd"));
		WebElement ref1 = call.findElement(By.name("pwd"));
		ref1.clear();
		ref1.sendKeys("manager");
		
		WebElement ref2 = call.findElement(By.className("initial"));
		ref2.click();
		
		String s4=call.getTitle();
		System.out.println(s4);
		call.close();
	}

}

