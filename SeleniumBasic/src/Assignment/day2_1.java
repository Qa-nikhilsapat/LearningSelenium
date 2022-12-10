package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir") + "\\Executibles\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		WebDriver call = new ChromeDriver();
		call.get("https://opensource-demo.orangehrmlive.com/");

		String s1 = call.getCurrentUrl();
		String s4 = "https://opensource-demo.orangehrmlive.com/";
		System.out.println(s1);
		System.out.println("expected Url: " + s4);
		System.out.println("URL validation: " + s1.equals(s4)+"\n");

		String s2 = call.getTitle();
		String s5 = "OrangeHRM";
		System.out.println(s2);
		System.out.println("Expected title: " + s2);
		System.out.println("Title validation: " + s2.equals(s5)+"\n");

	    WebElement ref = call.findElement(By.id("txtUsername"));
	    ref.sendKeys("Admin");
	   System.out.println("display or not "+ref.isDisplayed());
	   System.out.println("enable or not "+ref.isEnabled()+"\n");
	   
	   WebElement ref1 =call.findElement(By.id("txtPassword"));
	   ref1.sendKeys("admin123");
	   System.out.println("display or not "+ref1.isDisplayed());
	   System.out.println("enable or not "+ref1.isEnabled()+"\n");
	   
	   WebElement ref2 =call.findElement(By.id("btnLogin"));
	   System.out.println(ref2.isDisplayed());
	   System.out.println(ref2.isEnabled());
	   ref2.click();
	   
	   String s6=call.getTitle();
	   System.out.println(s6);
	   System.out.println(s6.equals(s2)); 
	   
	   call.findElement(By.linkText("/index.php/auth/logout\">Logout"));
	   ref2.click();

		// String s3 = call.getPageSource();
		// System.out.println(s3.length());

		//call.close();

	}

}
