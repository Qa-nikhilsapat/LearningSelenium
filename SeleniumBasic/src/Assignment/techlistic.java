package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//java
		driver.findElement(By.className("overflowable-item")).click();
		String s1=driver.getTitle();
		System.out.println(s1);
		String s2="TechListic - Atom";
		System.out.println("validation: "+s1.equals(s2));
		driver.navigate().back();
		//selenium
		driver.findElement(By.className("dropbtn")).click();
		String s3=driver.getCurrentUrl();
		String s33="https://www.techlistic.com/p/selenium-tutorials.html";
		System.out.println("validation: "+s3.equals(s33));
        driver.navigate().back();	
        //bdd
        driver.findElement(By.className("dropbtn"));
        String s4=driver.getCurrentUrl();
        String s44="https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html";
        System.out.println("validation: "+s4.equals(s44));
        driver.navigate().back();
        //testng
        driver.findElement(By.className("getCurrentUrl());"));
        String s5=driver.getCurrentUrl();
        String s55="https://www.techlistic.com/p/software-testing.html";
        System.out.println("validation: "+s5.equals(s55));
        driver.navigate().back();
	}

}
