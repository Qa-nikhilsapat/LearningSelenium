package operator2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricInfo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Thread.sleep(5000);
		driver.get("https://www.espncricinfo.com/");
		
		List<WebElement> call = driver.findElements(By.cssSelector(".ds-popper-wrapper"));
		
		System.out.println(call.size());
		
		for(int i=0;i<call.size();i++) {
			System.out.println(call.get(i).getText());
		}

	}

}
