package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	//
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver call = new ChromeDriver();
		
		//call.manage().window().maximize();
		call.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		call.get("https://www.facebook.com/");
		
		call.findElement(By.className("_4jy2")).click();
		//day
		WebElement s1 = call.findElement(By.id("day"));
				System.out.println("Date box visible: "+s1.isDisplayed());
		System.out.println("Date box enable: "+s1.isEnabled());
		
		List<WebElement> s11=call.findElements(By.cssSelector("._5k_5> span>span>select#day"));
		System.out.println("size:"+s11.size());
		for(int i=0;i<s11.size();i++) {
			System.out.println(s11.get(i).getText());
		}
		//month
		WebElement s2 = call.findElement(By.id("year"));
		System.out.println("Month box visible: "+s2.isDisplayed());
		System.out.println("Month box enable: "+s2.isEnabled());
		
		List<WebElement> s22= call.findElements(By.cssSelector("._5k_5> span>span>select#month"));// span>span>select#month ._5k_5 select#month ._5k_5>
		System.out.println("size:"+s22.size());	
		for(int i=0;i<s22.size();i++) {
				System.out.println(s22.get(i).getText());
			}
			
		//year
		WebElement s3 = call.findElement(By.id("month"));
		System.out.println("Month box visible: "+s3.isDisplayed());
		System.out.println("Month box enable: "+s3.isEnabled());
		List<WebElement> s33 =call.findElements(By.cssSelector("._5k_5> span>span>select#year"));
		System.out.println("size:"+s33.size());
		for(int i=0;i<s33.size();i++) {
			System.out.print(s33.get(i).getText());
		}


	}

}
