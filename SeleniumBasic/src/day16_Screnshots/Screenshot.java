package day16_Screnshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Screenshot {
	//Method    
	public static WebDriver setUp(String browserType, String appUrl) {
		WebDriver driver = null;
		if (browserType.equalsIgnoreCase("chrome")) {
			String exePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
			// setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", exePath);
			// creating an instance of Chrome browser and up-casting it to WebDriver
			// interface
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			String exePath = System.getProperty("user.dir") + "\\Executables\\geckodriver.exe";
			// setting the path for driver executable
			System.setProperty("webdriver.gecko.driver", exePath);
			// creating an instance of Chrome browser and up-casting it to WebDriver
			// interface
			driver = new FirefoxDriver();
		} else if (browserType.equalsIgnoreCase("ie")) {
			String exePath = System.getProperty("user.dir") + "\\Executables\\IEServerDriver.exe";
			// setting the path for driver executable
			System.setProperty("webdriver.ie.driver", exePath);
			// creating an instance of Chrome browser and up-casting it to WebDriver
			// interface
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get(appUrl);
		return driver;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
//		// setting the path for driver executable
//		System.setProperty("webdriver.chrome.driver", chromeExePath);
//		// creating an instance of Chrome browser and up-casting it to WebDriver
//		// interface
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//		// to enter required application URL use get() of WebDriver interface
//		driver.get("http://demo.actitime.com");
		
		WebDriver driver=setUp("chrome", "https://www.google.com");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenShot = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenShot, new File(".\\Screenshots\\GoogleSearchPage.png"));
	}
	
}