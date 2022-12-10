package Assignment;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4_3 {
//	Perform following operations on the application
//	1. Open any browser
//	2. Enter the url as https://opensource-demo.orangehrmlive.com/
//	3. verify login page
//	4. enter username and password
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		String currenttitle = driver.getTitle();
		System.out.println(currenttitle);
		String expected = "OrangeHRM";
		System.out.println("expected title "+expected);
		System.out.println("title validation "+currenttitle.equals(expected));
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		System.out.println("username display "+username.isDisplayed());
		System.out.println("username enable "+username.isEnabled());
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		System.out.println("password display "+password.isDisplayed());
		System.out.println("password enable "+password.isEnabled());		
		
	    WebElement login = driver.findElement(By.id("btnLogin"));
		System.out.println("is display: "+login.isDisplayed());
		System.out.println("is enable: "+login.isEnabled());
		
		WebElement forgotpassword = driver.findElement(By.id("forgotPasswordLink"));
		System.out.println("forgot link display "+forgotpassword.isDisplayed());
		System.out.println("forgot link display "+forgotpassword.isEnabled());
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		login.click();
		String s3 =driver.getTitle();
		System.out.println(s3.equals(expected));
		
		driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.partialLinkText("Logout")).click();
		
				
		driver.close();

	}

}
