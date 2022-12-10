package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google_day1_3 {

	public static void main(String[] args) {
		
		String driver =System.setProperty("webdriver.gecko.driver",//this setProperty should use
				"F:\\New folder\\SeleniumBasic\\Executibles\\geckodriver.exe");//use geckodriver as browser  
		WebDriver call= new FirefoxDriver();
		call.get("https:\\www.google.com");
		
		String s1=call.getTitle();
		
		System.out.println(s1);
		 String s2=call.getPageSource();//just fetch
		 call.close();
		 
		

	}

}
