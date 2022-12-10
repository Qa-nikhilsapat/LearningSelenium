package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_day1_2 {

	public static void main(String[] args) {
		
		String Driver=System.getProperty("user.dir")+"\\Executibles\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driver);
		
		WebDriver call = new ChromeDriver();
		call.get("https://www.facebook.com");
		
		String s2 =call.getTitle();
				 
		 String s3= "www.Facebook.com";
		 System.out.println("expected title: "+s3);
		 System.out.println("validation: "+s3.equals(s2));
		 
		 System.out.println("homepage title: "+s2);
		 call.close();

	}

}
