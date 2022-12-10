package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmArena {
	//https://www.gsmarena.com/
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver call = new ChromeDriver();
		call.manage().window().maximize();
		call.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		call.get("https://www.gsmarena.com/");
//		String s1=call.getCurrentUrl();
//		System.out.println(s1);
//		String s2="https://www.gsmarena.com/";
//		System.out.println(s1.equals(s2));
		//Thread.sleep(5000);
		call.findElement(By.linkText("Samsung")).click();
//		List<WebElement> devices = call.findElements(By.cssSelector("ul>li>a>strong>span"));
//		System.out.println(devices.size());
//		for(int i=0;i<devices.size();i++) {
//			System.out.println(devices.get(i).getText());
//		}
//		System.out.println("hi");
		

	}

}
