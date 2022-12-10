package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4_1 {
//	Perform following operations on the application
//	1. Open any browser
//	2. Enter the url as https://opensource-demo.orangehrmlive.com/
//	3. Verify login page elements
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		
//		String s1 =driver.getCurrentUrl();
//		System.out.println(s1);
//		String cUrl ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
//		System.out.println("expected URL "+cUrl);
//		System.out.println("URL validation "+s1.equals(cUrl));
//		
//		String s2  =driver.getTitle();
//		System.out.println(s2);
//		String s3="OrangeHRM";
//		System.out.println("expected URL "+s3 );
//		System.out.println("title validation "+s2.equals(s3));
		
		WebElement  username =driver.findElement(By.id("txtUsername"));
		//s4.sendKeys("Admin");
		System.out.println("Usernmae field is Disaplaying or not: "+username.isDisplayed());
		System.out.println("Username field is enable or not: "+username.isEnabled());
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		//s5.sendKeys("Test@123");
		System.out.println("Password field is Disaplaying or not: "+password.isDisplayed());
		System.out.println("Password field is enable or not: "+password.isEnabled());
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		System.out.println("login button is Disaplaying: "+login.isDisplayed());
		System.out.println("login button is enable or not: "+login.isEnabled());
		//System.out.println(login.getText());
		
		WebElement forgotpassword = driver.findElement(By.id("forgotPasswordLink"));
		System.out.println("forgot link display: "+forgotpassword.isDisplayed());
		System.out.println("forgot link display: "+forgotpassword.isEnabled());
		
		//login.click();
		driver.close();
		
				
		

	}

}
