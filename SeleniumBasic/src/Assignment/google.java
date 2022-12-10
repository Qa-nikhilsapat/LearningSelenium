package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java programs");
		
		List<WebElement> call = driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		
		System.out.println(call.size());
		
		for(int i=0;i<call.size();i++) {
			System.out.println(call.get(i).getText());
		}
				driver.close();
	}
}
