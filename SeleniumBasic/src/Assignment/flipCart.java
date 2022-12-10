package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Thread.sleep(5000);
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> call= driver.findElements(By.cssSelector(".xtXmba"));
		System.out.println("menu count: "+call.size());
		for(int i=0;i<call.size();i++) {
			System.out.println(call.get(i).getText());
		}
		driver.close();

	}

}
