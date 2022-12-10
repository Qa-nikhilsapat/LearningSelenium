package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.WrapsElement;

public class day4_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		
		WebDriver call = new ChromeDriver();
		call.get("https://demo.actitime.com/login.do");
		
		WebElement username =call.findElement(By.id("username"));
		System.out.println("username field is display "+username.isDisplayed());
		System.out.println("username field is enable "+username.isEnabled());
		
		String defaultusername =username.getAttribute("placeholder");
		System.out.println("bydefault "+defaultusername);
		System.out.println("attibute validataion "+defaultusername.equals("Username"));
		
		
		WebElement password = call.findElement(By.name("pwd"));
		System.out.println("password field is display "+username.isDisplayed());
		System.out.println("password field is enable "+username.isEnabled());
		String defaultpassword = password.getAttribute("placeholder");
		System.out.println("default password "+defaultpassword);
		System.out.println("password validation "+defaultpassword.equals("Password"));
		
		WebElement login = call.findElement(By.id("loginButton"));
		System.out.println("login field is display "+login.isDisplayed());
		System.out.println("login field is Enabled "+login.isEnabled());
		
		WebElement checkbox = call.findElement(By.id("keepLoggedInLabel"));
		System.out.println("button is display "+checkbox.isDisplayed());
		System.out.println("button is enable "+checkbox.isEnabled());
		//System.out.println(checkbox);
		String checkboxtext =checkbox.getText();
		System.out.println(checkboxtext);
		
		WebElement button = call.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("button is display "+button.isDisplayed());
		System.out.println("button is selected "+button.isEnabled());
		
		//call.close();
		
		//login.click();



	}

}
//Perform following operations on the application
//1. Open any browser
//2. Enter the url as https://demo.actitime.com/login.do
//3. Verify login page elements
