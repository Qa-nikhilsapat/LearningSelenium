package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Executibles\\chromedriver.exe");
		
		WebDriver call = new ChromeDriver();
		
		call.manage().window().maximize();
		call.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		call.get("https://www.demoblaze.com/");
		
		List<WebElement> deviceName = call.findElements(By.cssSelector("div#tbodyid h4>a"));
		List<WebElement> devicePrice= call.findElements(By.cssSelector("div#tbodyid h5"));
				
		System.out.println("deviceNames : "+deviceName.size());
		
		for(int i=0;i<deviceName.size();i++) {
			System.out.println(deviceName.get(i).getText() +" : "+devicePrice.get(i).getText());
		}
	}
}
