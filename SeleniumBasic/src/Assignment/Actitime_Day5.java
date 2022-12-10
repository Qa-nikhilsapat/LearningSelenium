package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Day5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver call = new ChromeDriver();
		//call.manage().window().maximize();
		call.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		call.get("https:\\demo.actitime.com/");
		
		call.findElement(By.id("username")).sendKeys("admin");
		call.findElement(By.name("pwd")).sendKeys("manager");
		call.findElement(By.id("loginButton")).click();
		call.findElement(By.id("container_tasks")).click();//task
		call.findElement(By.cssSelector(".title.ellipsis")).click();//Add new
		call.findElement(By.cssSelector(".item.createNewTasks")).click();//new task
		call.findElement(By.className("customerSelector")).click();//dropdown customer
		call.findElement(By.cssSelector(".customerSelector .searchItemList>.itemRow:nth-child(5)")).click();//customer
		call.findElement(By.className("projectSelector")).click();//project
		call.findElement(By.cssSelector(".projectSelector .searchItemList>.itemRow:nth-child(6)")).click();//project name
	}

}
