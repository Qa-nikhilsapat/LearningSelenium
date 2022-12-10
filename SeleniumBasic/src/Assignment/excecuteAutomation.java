package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excecuteAutomation {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver",".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		String s2="https://demosite.executeautomation.com/Login.html";
		System.out.println(s1.equals(s2));
		
		driver.findElement(By.id("userName"));//.sendKeys("execution");
		driver.findElement(By.name("Password"));//.sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		String s3=driver.getCurrentUrl();
		String s4=driver.getTitle();
		System.out.println(s3);
		System.out.println(s4);
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
