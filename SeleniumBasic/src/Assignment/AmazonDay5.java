package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDay5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String s1=driver.getTitle();
		System.out.println("Title: "+s1);
		//menu list
		driver.findElement(By.className("hm-icon")).click();
		driver.findElement(By.linkText("New Releases")).click(); //one of menu
		String s2=driver.getTitle();
		System.out.println("Title: "+s2);
		driver.navigate().back();
		String s3=driver.getTitle();
		System.out.println("Title: "+s3);
		System.out.println("title validation: "+s3.equals(s1));
		
		//driver.findElement(By.className("hmenu-item")).click();
		//driver.findElement(By.cssSelector("/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2")).click();
		System.out.println("hi");

	}

}
