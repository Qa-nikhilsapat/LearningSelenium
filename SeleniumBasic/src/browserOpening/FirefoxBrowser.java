package browserOpening;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"F:\\New folder\\SeleniumBasic\\Executibles\\geckodriver.exe");
		
		FirefoxDriver fdriver = new FirefoxDriver();
		
		fdriver.get("https://www.google.com");
		fdriver.close();
		
		

//		System.setProperty("webdriver.gecko.driver",
//				"F:\\New folder\\SeleniumBasic\\Executibles\\geckodriver.exe");
//		FirefoxDriver fdriver = new FirefoxDriver();
//		fdriver.get("https://www.google.com");
//		fdriver.close();

	}

}
