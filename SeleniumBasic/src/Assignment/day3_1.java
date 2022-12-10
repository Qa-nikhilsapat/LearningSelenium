package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3_1 {
	//1. Open any browser
	//2. Enter the url as https://opensource-demo.orangehrmlive.com/
	//3. Verify login page
	//3. Username as Admin
	//4. password as admin123
	//5. click on Login button 
	//6. verify home page
	//7. close the browser
	public static void main(String[] args) {
		String path= System.getProperty("user.dir")+"\\Executibles\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver call= new ChromeDriver();
		call.get("https://opensource-demo.orangehrmlive.com/");
		
		//for password we can use 'name' and "id" but not "class"
		WebElement ref = call.findElement(By.id("txtUsername"));
		ref.clear();
		ref.sendKeys("Admin");
		//for password we can use 'name' and "id" but not "class"
		//WebElement ref2 = call.findElement(By.className("form-hint"));// cant access by class
		WebElement ref2 = call.findElement(By.name("txtPassword"));
		ref2.clear();
		ref2.sendKeys("admin123");
		
		// login button
		WebElement ref3 = call.findElement(By.id("btnLogin"));
		//WebElement ref3 = call.findElement(By.className("button"));
		ref3.click();
		
		//call.close();
		
		
		
		

	}

}
